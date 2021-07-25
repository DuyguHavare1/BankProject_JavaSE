package atm;

import java.util.Scanner;

public class Atm implements IInterface {

	Kasa kasa = new Kasa();
	Scanner klavye = new Scanner(System.in);

	@Override

	public boolean giris() {
		String ad, sifre;
		String adminKullaniciAd = "admin", adminSifre = "1234";
		int geriSayim = 3;

		while (geriSayim > 0) {
			System.out.println("Kullan�c� ad�n� giriniz");
			ad = klavye.nextLine();

			System.out.println("Kullan�c� �ifresi giriniz");
			sifre = klavye.nextLine();

			if ((ad.equals(adminKullaniciAd)) && (sifre.equalsIgnoreCase(adminSifre))) {
				System.out.println("\nAnasayfaya  y�nlendiriliyorsunuz.\n");
				secim();
				break;
			}
			geriSayim--;
			System.out.println("Kalan hakk�n�z: " + geriSayim);
			if (geriSayim <= 0) {
				System.out.println("Hakk�n�z kalmad� Kart�n�z bloke oldu\nl�tfen 000 11 22 numaray� aray�n�z");
				System.exit(0);
				// break;
			}
		}

		return false;
	}

	@Override
	public void secim() {
		while (true) {
			System.out.println("L�tfen bir se�im yap�n�z");
			System.out.println("1 �zet\n2 para ekle\n3 para cek \n4 c�k�s");
			int secim;
			secim = klavye.nextInt();
			switch (secim) {
			case 1:
				System.out.println("�zet ...");
				ozet();
				break;

			case 2:
				System.out.println("para ekle ...");
				paraEkle();
				break;

			case 3:
				System.out.println("para �ek ...");
				paraCek();
				break;

			case 4:
				System.out.println("��k�� yap�l�yor.");
				System.exit(0);
				break;

			default:
				System.out.println("L�tfen belirtilenleri se�iniz.");
				break;
			}
		}

	}

	@Override
	public void kasa() {
		Kasa kasa = new Kasa();

	}

	@Override
	public void ozet() {
		System.out.println("\nbakiyeniz: " + kasa.getMiktar() + "\n");

	}

	@Override
	public void paraEkle() {
		System.out.println("eklenecek paray�  giriniz.");
		int ekle = klavye.nextInt();
		Kasa.miktar += ekle;
		System.out.println("\nyeni bakiyeniz: " + kasa.getMiktar() + "\n");

	}

	@Override
	public void paraCek() {
		System.out.println("�ekmek istedi�iniz miktar� giriniz.");
		int ekle = klavye.nextInt();
		if (Kasa.miktar <= 0) {
			System.out.println("�ncelikle para eklemelisiniz" + "\n");
		} else if (ekle >= 3000) {
			System.out.println("tek seferde " + ekle + " TL �ekemezsiniz");
		} else {
			Kasa.miktar -= ekle;
			System.out.println("\ntoplam bakiye: " + kasa.getMiktar() + "\n");
		}

	}
}
