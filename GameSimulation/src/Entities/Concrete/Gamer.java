	package Entities.Concrete;
	import java.sql.Date;

	import Entities.Abstract.Entity;
public class Gamer implements Entity{

		
		private int id;
		private String firstName;
		private String lastName;
		private String NationalityId;
		private Date birthDate;
		
		
		public Gamer() {}
		public Gamer(String firstName, String lastName, String nationalityId, Date birthDate) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			NationalityId = nationalityId;
			this.birthDate = birthDate;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getNationalityId() {
			return NationalityId;
		}

		public void setNationalityId(String nationalityId) {
			NationalityId = nationalityId;
		}

		public Date getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		};
}
