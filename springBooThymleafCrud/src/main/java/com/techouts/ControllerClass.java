package com.techouts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techouts.model.Book;
import com.techouts.repository.BookRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/Books/")
public class ControllerClass {

    private final BookRepository bookRepository;

    @Autowired
    public ControllerClass(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/signup")
    public String showSignUpForm(Book book) {
        return "add-book";
    }

    @GetMapping("/list")
    public String showUpdateForm(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addBook(@Valid Book book, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-book";
        }

        bookRepository.save(book);
        return "redirect:list";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("book", book);
        return "update-book";
    }

    @PostMapping("/update/{id}")
    public String updateBook(@PathVariable("id") int id, @Valid Book book, BindingResult result,
        Model model) {
        if (result.hasErrors()) {
            book.setId(id);
            return "update-book";
        }

        bookRepository.save(book);
        model.addAttribute("books", bookRepository.findAll());
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id, Model model) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        bookRepository.delete(book);
        model.addAttribute("books", bookRepository.findAll());
        return "index";
    }
}
