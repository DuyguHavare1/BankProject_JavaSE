package atm;

import java.io.Serializable;
import java.util.Scanner;

public class Login implements Serializable {
	private static final long serialVersionUID = 6173644581641347353L;

	String kullaniciAdi = "Duygu";
	String email = "duygu@gmail.com";
	String sifre = "duygu123";

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(String kullaniciAdi, String email, String sifre) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.email = email;
		this.sifre = sifre;
	}

	@Override
	public String toString() {
		return "Login [kullaniciAdi=" + kullaniciAdi + ", email=" + email + ", sifre=" + sifre + "]";
	}

	public boolean adminGiris() {
		Scanner klavye = new Scanner(System.in);
		String kullanici, mail, sifre;

		System.out.println("Lütfen kullanýcý adýný");
		kullanici = klavye.nextLine();

		System.out.println("Lütfen mail adýný");
		mail = klavye.nextLine();
		// https://github.com/hamitmizrak/JavaDatabases.git

		System.out.println("Lütfen þifrenizi adýný");
		sifre = klavye.nextLine();

		// default: mail: info@ecodation.com
		// þifre: root

		if ((this.getEmail().equals(mail) || this.getKullaniciAdi().equalsIgnoreCase(kullanici))
				&& this.getSifre().equals(sifre)) {

			System.out.println("Admin sayfasýna yönlendiriliyorsunuz");
			return true;

		} else {
			System.out.println("Kullanýcý adýnýz veya þifreniz yanlýþtýr ");
			return false;
		}
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

}
