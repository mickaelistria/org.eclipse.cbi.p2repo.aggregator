/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.beelang.tests.testmaterial;

/**
 * @author henrik
 * 
 */
public class Person {
	private String name;

	private Person father;

	private Person mother;

	private String familyName;

	private Integer birthYear;

	public Person() {
		this.name = "";
		this.familyName = "";
		this.birthYear = 2010;
	}

	public Person(Person mother, Person father) {
		this();
		this.mother = mother;
		this.father = father;
	}

	/**
	 * @return the birthYear
	 */
	public Integer getBirthYear() {
		return birthYear;
	}

	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * @return the father
	 */
	public Person getFather() {
		return father;
	}

	/**
	 * @return the mother
	 */
	public Person getMother() {
		return mother;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param birthYear
	 *            the birthYear to set
	 */
	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * @param familyName
	 *            the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * @param father
	 *            the father to set
	 */
	public void setFather(Person father) {
		this.father = father;
	}

	/**
	 * @param mother
	 *            the mother to set
	 */
	public void setMother(Person mother) {
		this.mother = mother;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
