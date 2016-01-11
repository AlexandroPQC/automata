package org.hacklab.alexandro.miautomata;


public class AutomataSistema {
    private char [][] q = new char[9][9];
    private int est_inicial, est, n_cadena;
    private int [] est_final = new int[9];
    AutomataSistema(){
        q[0][1] = 's';
        q[0][4] = 't';
        q[1][2] = 'i';
        q[2][3] = 's';
        q[3][4] = 't';
        q[4][5] = 'e';
        q[5][6] = 'm';
        q[6][7] = 'a';
        q[7][8] = 's';
        est_inicial = 0;
        est_final[0] = 7;
        est_final[2] = 8;
        est = est_inicial;
        n_cadena = 0;
    }
    public boolean verificar(String cadena, int est, int n_cadena){
        if (n_cadena > cadena.length())
            return false;
        else {
            for (int i = 0; i <= 8; i++) {
                if (q[est][i] == cadena.charAt(n_cadena)) {
                    est = i;
                    n_cadena++;
                    if (n_cadena == cadena.length()){
                        for (int j = 0; j <= 8; j++)
                            if(est_final[j] == est)
                                return true;
                        return false;
                    }
                    verificar(cadena, est, n_cadena);
                }
            }
            return false;
        }
    }
}
