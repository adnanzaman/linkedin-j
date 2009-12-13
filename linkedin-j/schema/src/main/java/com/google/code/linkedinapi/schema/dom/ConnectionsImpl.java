
package com.google.code.linkedinapi.schema.dom;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.code.linkedinapi.schema.Connections;
import com.google.code.linkedinapi.schema.Person;

public class ConnectionsImpl
    extends BaseSchemaEntity
    implements Connections
{
    protected List<Person> person;
    protected Long total;

    public List<Person> getPerson() {
        if (person == null) {
            person = new ArrayList<Person>();
        }
        return this.person;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

	@Override
	public void init(Element element) {
		setTotal(Long.valueOf(element.getAttribute("total")));
		List<Element> persons = DomUtils.getChildElementsByLocalName(element, "person");
		for (Element person : persons) {
			PersonImpl personImpl = new PersonImpl();
			personImpl.init(person);
			getPerson().add(personImpl);
		}
	}

	@Override
	public Element toXml(Document document) {
		Element element = document.createElement("connections");
		element.setAttribute("total", String.valueOf(getTotal()));
		for (Person person : getPerson()) {
			element.appendChild(((PersonImpl) person).toXml(document));
		}
		return element;
	}
}