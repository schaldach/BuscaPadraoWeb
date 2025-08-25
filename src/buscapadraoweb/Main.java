/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package buscapadraoweb;

import buscaweb.CapturaRecursosWeb;
import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class Main {

    // busca char em vetor e retorna indice
    public static int get_char_ref (char[] vet, char ref ){
        for (int i=0; i<vet.length; i++ ){
            if (vet[i] == ref){
                return i;
            }
        }
        return -1;
    }

    // busca string em vetor e retorna indice
    public static int get_string_ref (String[] vet, String ref ){
        for (int i=0; i<vet.length; i++ ){
            if (vet[i].equals(ref)){
                return i;
            }
        }
        return -1;
    }

    

    //retorna o próximo estado, dado o estado atual e o símbolo lido
    public static int proximo_estado(char[] alfabeto, int[][] matriz,int estado_atual,char simbolo){
        int simbol_indice = get_char_ref(alfabeto, simbolo);
        if (simbol_indice != -1){
            return matriz[estado_atual][simbol_indice];
        }else{
            return -1;
        }
    }

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia e usa objeto que captura código-fonte de páginas Web
        CapturaRecursosWeb crw = new CapturaRecursosWeb();
        crw.getListaRecursos().add("https://pt.wikipedia.org/wiki/Placas_de_identifica%C3%A7%C3%A3o_de_ve%C3%ADculos_no_Brasil");
        crw.getListaRecursos().add("https://www.kavak.com/br/blog/significado-das-letras-da-placa-mercosul");
        crw.getListaRecursos().add("https://olhardigital.com.br/2025/01/09/carros-e-tecnologia/placas-mercosul-2025-veja-o-que-voce-precisa-fazer-para-adequar-seu-carro-e-nao-levar-multa/");
        ArrayList<String> listaCodigos = crw.carregarRecursos();

        String codigoHTML = listaCodigos.get(0);

        //mapa do alfabeto
        char[] alfabeto = new char[36];
        alfabeto[0] = '0';
        alfabeto[1] = '1';
        alfabeto[2] = '2';
        alfabeto[3] = '3';
        alfabeto[4] = '4';
        alfabeto[5] = '5';
        alfabeto[6] = '6';
        alfabeto[7] = '7';
        alfabeto[8] = '8';
        alfabeto[9] = '9';
        alfabeto[10] = 'a';
        alfabeto[11] = 'b';
        alfabeto[12] = 'c';
        alfabeto[13] = 'd';
        alfabeto[14] = 'e';
        alfabeto[15] = 'f';
        alfabeto[16] = 'g';
        alfabeto[17] = 'h';
        alfabeto[18] = 'i';
        alfabeto[19] = 'j';
        alfabeto[20] = 'k';
        alfabeto[21] = 'l';
        alfabeto[22] = 'm';
        alfabeto[23] = 'n';
        alfabeto[24] = 'o';
        alfabeto[25] = 'p';
        alfabeto[26] = 'q';
        alfabeto[27] = 'r';
        alfabeto[28] = 's';
        alfabeto[29] = 't';
        alfabeto[30] = 'u';
        alfabeto[31] = 'v';
        alfabeto[32] = 'w';
        alfabeto[33] = 'x';
        alfabeto[34] = 'y';
        alfabeto[35] = 'z';

        //mapa de estados
        String[] estados = new String[8];
        estados[0] = "q0";
        estados[1] = "q1";
        estados[2] = "q2";
        estados[3] = "q3";
        estados[4] = "q4";
        estados[5] = "q5";
        estados[6] = "q6";
        estados[7] = "q7";

        String estado_inicial = "q0";

        //estados finais
        String[] estados_finais = new String[1];
        estados_finais[0] = "q7";

        //tabela de transição de AFD para reconhecimento números de dois dígitos
        int[][] matriz = new int[8][36];
        //transições de q0
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '0')] = -1;
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '1')] = -1;
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '2')] = -1;
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '3')] = -1;
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '4')] = -1;
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '5')] = -1;
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '6')] = -1;
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '7')] = -1;
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '8')] = -1;
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, '9')] = -1;
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'a')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'b')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'c')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'd')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'e')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'f')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'g')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'h')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'i')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'j')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'k')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'l')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'm')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'n')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'o')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'p')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'q')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'r')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 's')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 't')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'u')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'v')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'w')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'x')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'y')] = get_string_ref(estados, "q1");
        matriz[get_string_ref(estados, "q0")][get_char_ref(alfabeto, 'z')] = get_string_ref(estados, "q1");
        
        //transições de q1
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '0')] = -1;
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '1')] = -1;
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '2')] = -1;
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '3')] = -1;
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '4')] = -1;
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '5')] = -1;
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '6')] = -1;
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '7')] = -1;
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '8')] = -1;
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, '9')] = -1;
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'a')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'b')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'c')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'd')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'e')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'f')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'g')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'h')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'i')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'j')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'k')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'l')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'm')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'n')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'o')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'p')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'q')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'r')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 's')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 't')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'u')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'v')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'w')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'x')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'y')] = get_string_ref(estados, "q2");
        matriz[get_string_ref(estados, "q1")][get_char_ref(alfabeto, 'z')] = get_string_ref(estados, "q2");
        
        //transições de q2
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '0')] = -1;
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '1')] = -1;
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '2')] = -1;
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '3')] = -1;
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '4')] = -1;
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '5')] = -1;
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '6')] = -1;
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '7')] = -1;
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '8')] = -1;
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, '9')] = -1;
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'a')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'b')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'c')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'd')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'e')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'f')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'g')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'h')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'i')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'j')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'k')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'l')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'm')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'n')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'o')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'p')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'q')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'r')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 's')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 't')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'u')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'v')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'w')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'x')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'y')] = get_string_ref(estados, "q3");
        matriz[get_string_ref(estados, "q2")][get_char_ref(alfabeto, 'z')] = get_string_ref(estados, "q3");

        //transições de q3
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q4");
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q4");
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q4");
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q4");
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q4");
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q4");
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q4");
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q4");
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q4");
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q4");
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'a')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'b')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'c')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'd')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'e')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'f')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'g')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'h')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'i')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'j')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'k')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'l')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'm')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'n')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'o')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'p')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'q')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'r')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 's')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 't')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'u')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'v')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'w')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'x')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'y')] = -1;
        matriz[get_string_ref(estados, "q3")][get_char_ref(alfabeto, 'z')] = -1;

        //transições de q4
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '0')] = -1;
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '1')] = -1;
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '2')] = -1;
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '3')] = -1;
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '4')] = -1;
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '5')] = -1;
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '6')] = -1;
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '7')] = -1;
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '8')] = -1;
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, '9')] = -1;
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'a')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'b')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'c')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'd')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'e')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'f')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'g')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'h')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'i')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'j')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'k')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'l')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'm')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'n')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'o')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'p')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'q')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'r')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 's')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 't')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'u')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'v')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'w')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'x')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'y')] = get_string_ref(estados, "q5");
        matriz[get_string_ref(estados, "q4")][get_char_ref(alfabeto, 'z')] = get_string_ref(estados, "q5");

        //transições de q5
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q6");
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'a')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'b')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'c')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'd')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'e')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'f')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'g')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'h')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'i')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'j')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'k')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'l')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'm')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'n')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'o')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'p')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'q')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'r')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 's')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 't')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'u')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'v')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'w')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'x')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'y')] = -1;
        matriz[get_string_ref(estados, "q5")][get_char_ref(alfabeto, 'z')] = -1;

        //transições de q6
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '0')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '1')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '2')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '3')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '4')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '5')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '6')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '7')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '8')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, '9')] = get_string_ref(estados, "q7");
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'a')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'b')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'c')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'd')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'e')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'f')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'g')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'h')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'i')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'j')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'k')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'l')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'm')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'n')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'o')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'p')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'q')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'r')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 's')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 't')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'u')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'v')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'w')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'x')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'y')] = -1;
        matriz[get_string_ref(estados, "q6")][get_char_ref(alfabeto, 'z')] = -1;

        //transições de q7
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '0')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '1')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '2')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '3')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '4')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '5')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '6')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '7')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '8')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, '9')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'a')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'b')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'c')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'd')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'e')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'f')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'g')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'h')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'i')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'j')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'k')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'l')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'm')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'n')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'o')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'p')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'q')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'r')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 's')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 't')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'u')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'v')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'w')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'x')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'y')] = -1;
        matriz[get_string_ref(estados, "q7")][get_char_ref(alfabeto, 'z')] = -1;
    
        int estado = get_string_ref (estados, estado_inicial);
        int estado_anterior = -1;
        ArrayList<String> palavras_reconhecidas = new ArrayList();


        String palavra = "";

        //varre o código-fonte de um código
        for (int i=0; i<codigoHTML.length(); i++){

            estado_anterior = estado;
            estado = proximo_estado(alfabeto, matriz, estado, codigoHTML.charAt(i));
            //se o não há transição
            if (estado == -1){
                //pega estado inicial
                estado = get_string_ref(estados, estado_inicial);
                // se o estado anterior foi um estado final
                if (get_string_ref(estados_finais, estados[estado_anterior]) != -1){
                    //se a palavra não é vazia adiciona palavra reconhecida
                    if ( ! palavra.equals("")){
                        palavras_reconhecidas.add(palavra);
                    }
                    // se ao analisar este caracter não houve transição
                    // teste-o novamente, considerando que o estado seja inicial
                    i--;
                }
                //zera palavra
                palavra = "";
                
            }else{
                //se houver transição válida, adiciona caracter a palavra
                palavra += codigoHTML.charAt(i);
            }
        }


        //foreach no Java para exibir todas as palavras reconhecidas
        for (String p: palavras_reconhecidas){
            System.out.println (p);
        }


    }



}
