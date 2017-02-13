class Magnetofon {
	boolean mozeNagrywac = false;
	
	void odtworzTasme() {
		System.out.println("odtwarzam tasme");
}
	void nagrajTasme() {
		System.out.println("nagrywam tasme");
}
}
class MagnetofonTester {
	public static void main(String[] args) {
		
		Magnetofon m= new Magnetofon();
		m.mozeNagrywac = true;
		m.odtworzTasme();
		
		if (m.mozeNagrywac == true) {
			m.nagrajTasme();
}
}
}