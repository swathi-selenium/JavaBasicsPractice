package OOPSconcepts;
 interface Humans {
	
		public void department();

		public void jobRole();

	}

	 interface Lecturer extends Humans 
	{
		public void subject();
	}

		interface Math_Teacher extends Humans,Lecturer{
			
			public void Division();
			

		}


