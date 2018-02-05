package fibonacci;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int cases = 10;//nombre cases
int tab[] = new int [cases];//création du tableau
tab[0]=0;//on démarre à 0
tab[1]=1;

	for(int i=2;i<cases;i++) {
		tab[i] = tab[i-1] + tab[i-2]; //opération
	}
	
	for(int i=0;i<cases;i++) {
		System.out.println(""+tab[i]);//on affiche les résultats
	}
	
	}

}
