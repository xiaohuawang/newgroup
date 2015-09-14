package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the HCCLASS database table.
 * 
 */
@Entity
@NamedQuery(name="Hcclass.findAll", query="SELECT h FROM Hcclass h")
public class Hcclass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long crn;

	private int classroomnum;

	private int coursenum;

	private String daytime;

	@Column(name="\"ENABLE\"")
	private int enable;

	private String semester;

	//bi-directional many-to-one association to Hcuser
	@ManyToOne
	@JoinColumn(name="INSTRUCTORID")
	private Hcuser hcuser;

	public Hcclass() {
	}

	public long getCrn() {
		return this.crn;
	}

	public void setCrn(long crn) {
		this.crn = crn;
	}

	public int getClassroomnum() {
		return this.classroomnum;
	}

	public void setClassroomnum(int classroomnum) {
		this.classroomnum = classroomnum;
	}

	public int getCoursenum() {
		return this.coursenum;
	}

	public void setCoursenum(int coursenum) {
		this.coursenum = coursenum;
	}

	public String getDaytime() {
		return this.daytime;
	}

	public void setDaytime(String daytime) {
		this.daytime = daytime;
	}

	public int getEnable() {
		return this.enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public String getSemester() {
		return this.semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Hcuser getHcuser() {
		return this.hcuser;
	}

	public void setHcuser(Hcuser hcuser) {
		this.hcuser = hcuser;
	}

}