class OdtwarzaczDVD {
	boolean mozeNagrywac = false;
	
	void nagrajPlyteDVD() {
		System.out.println("nagrywam plyte DVD");
	}
	void odtworzPlyteDVD() {
		System.out.println("Odtwarzam plyte DVD");
	}
   }

 class OdtwarzaczDVDTester {
	 public static void main(String[] args) {
		 
	  OdtwarzaczDVD o = new OdtwarzaczDVD();
	  o.mozeNagrywac = true;
	  o.odtworzPlyteDVD();
	  
	  if (o.mozeNagrywac == true) {
		  o.nagrajPlyteDVD();
   }
  }
}