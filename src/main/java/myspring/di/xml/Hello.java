package myspring.di.xml;

public class Hello {

	String name;
	Printer printer;
	
	public Hello() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Printer getPrinter() {
		return printer;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public String sayHello() {
		return "Hello " + name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
	
}
