package org.centrale.projet.jeu_dames;

public class tablier {
    private int [][] matrice;
    
    public tablier() {
        matrice = new int[10][10];
    }

    public int[][] getMatrice() {
        return matrice;
    }

    public void setMatrice(int[][] matrice) {
        this.matrice = matrice;
    }
    
    public void creerJeu(){
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if (i==0 || i==2){
                    switch(j){
                        case 1:
                            matrice[i][j]=1;
                        case 3:
                            matrice[i][j]=1;
                        case 5:
                            matrice[i][j]=1;
                        case 7:
                            matrice[i][j]=1;
                        case 9:
                            matrice[i][j]=1;
                    }  
                }
                if (i==1 || i==3){
                    switch(j){
                        case 0:
                            matrice[i][j]=1;
                        case 2:
                            matrice[i][j]=1;
                        case 4:
                            matrice[i][j]=1;
                        case 8:
                            matrice[i][j]=1;
                        case 10:
                            matrice[i][j]=1;
                    }  
                }
                if (i==6 || i==8){
                    switch(j){
                        case 1:
                            matrice[i][j]=2;
                        case 3:
                            matrice[i][j]=2;
                        case 5:
                            matrice[i][j]=2;
                        case 7:
                            matrice[i][j]=2;
                        case 9:
                            matrice[i][j]=2;
                    } 
                }
                if(i==7 || i==9){
                    switch(j){
                        case 0:
                            matrice[i][j]=2;
                        case 2:
                            matrice[i][j]=2;
                        case 4:
                            matrice[i][j]=2;
                        case 8:
                            matrice[i][j]=2;
                        case 10:
                            matrice[i][j]=2;
                    }
                }
            }
        }
    }
    
    public void afficheJeu() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 10; j++) {
                System.out.print(matrice[i][j] + " ");
            }
        }
    }
    
}
