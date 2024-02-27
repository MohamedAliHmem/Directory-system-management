package tp12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Annuaire {
	Map<String, Fiche> ann ;
	
	public Annuaire() {
		this.ann = new HashMap<>();
	}
	
	public void afficheParNom(String nom){
		Fiche f = this.ann.get(nom);
		System.out.println("le nom de fiche : "+nom+" le numero : "+f.numero+" l'adresse : "+f.adresse);
	}
	
	public void saisir(String nom,Fiche f) {
		this.ann.put(nom, f);
	}
	
	public void affiche() {
		for(Entry<String, Fiche> a : this.ann.entrySet()) {
			System.out.println("le nom : "+a.getKey()+" le numero : "+a.getValue().numero+" l'adresse : "+a.getValue().adresse);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Annuaire ann = new Annuaire();
		
		Fiche f1 = new Fiche(123,"nabeul");
		Fiche f2 = new Fiche(987,"tunis");
		
		ann.saisir("nom1", f1);
		ann.saisir("nom2", f2);
		
		while(true) {
			System.out.println("donne le controle a saisir");
			String commande = sc.nextLine();
		if(commande.equals("?")) {
			System.out.println("donne le nom a afficher");
			String n = sc.nextLine();
			ann.afficheParNom(n);
		}else if(commande.equals("+")) {
			System.out.println("donne un nom");
			String n = sc.nextLine();
			
			System.out.println("donne un numero");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.println("donne une adresse");
			String adresse = sc.nextLine();
			
			Fiche f =new Fiche(num,adresse);
			
			ann.saisir(n,f);
		}else if(commande.equals("!")) {
			ann.affiche();
		}else if (commande.equals(".")) {
	        System.out.println("Programme termine");
	        break;
        } else {
            System.out.println("Commande invalide");
        }
		
		}
	}
	
}







