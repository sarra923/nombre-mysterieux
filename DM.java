package MonPackage;

public class DM {

public static void main(String[] args) {

		//Déclaration des variables

		String nom1, nom2;
		int nbmyst, nbtest, Cpt;

		//Saisie des données par l'utilisateur

		nom1 = Saisie.lire_String("Joueur n°1, veuillez rentrer votre prénom.");
		nom2 = Saisie.lire_String("Joueur n°2, veuillez rentrer votre prénom.");
		nbmyst = Saisie.lire_int( nom1 + ", choisissez et saisissez un nombre compris entre 1 et 100.");

		//Traitement :

			while ((nbmyst < 1) || (nbmyst > 100))
		
			{
				nbmyst = Saisie.lire_int( nom1 + " le nombre doit être compris UNIQUEMENT entre 1 et 100, recommencez!");
			}

		Cpt = 0;
		nbtest = 0;
		
		while (Cpt < 10 && nbmyst != nbtest)
		
		{
			nbtest = Saisie.lire_int(nom2 + ", Le nombre choisis par"+ nom2 + " est compri entre 1 et 100. Es-tu capable de trouver le nombre mystère choisis par " + nom2 + " ? A toi de jouer!");
		
			if (nbmyst == nbtest )
			{
				Cpt = Cpt+1;
		
				System.out.println("Bien joué " + nom2 + " tu as réussi à trouver le nombre mystère en " + Cpt + " essai(s) !");
			}
			else
			{
				if (nbmyst < nbtest)
				{
					Cpt = Cpt+1;
					System.out.println("C'EST TROP HAUT! Tu en es à " +Cpt+ " essai(s)" );
				}
				else
						{
		
					Cpt = Cpt+1;
					System.out.println("C'EST TROP BAS! Tu en es à " +Cpt+ " essai(s)");
				}
			}
			if (Cpt == 10)
			{
				System.out.println("Tu as PERDU, tu as épuisé tous tes essais ! Le nombre choisi par "+nom1+ " était " + nbmyst+ ".");
			}
		} 	
}
		}