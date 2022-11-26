package com.techouts.HibernateSecond;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.techouts.HibernateSecond.TablePerHierarchy;
@Entity
@DiscriminatorValue("Irreglar")
@Access(value=AccessType.FIELD)

public class IrregularStudents extends TablePerHierarchy {
	@Column(name="detend")
	private String detend;
	@Column(name="knowledge")
	private String knowledge;
	public String getDetend() {
		return detend;
	}
	public void setDetend(String detend) {
		this.detend = detend;
	}
	public String getKnowledge() {
		return knowledge;
	}
	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}
	public IrregularStudents() {
		super();
	}
	

}
