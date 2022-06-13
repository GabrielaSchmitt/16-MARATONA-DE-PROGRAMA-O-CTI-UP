* Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C 
*com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem 
*"Valores aceitos", senão escrever "Valores nao aceitos".

*Entrada
*Quatro números inteiros A, B, C e D.

*Saída
*Mostre a respectiva mensagem após a validação dos valores.
*      input        |      output
*_________________________________________
* 5 6 7 8           | Valores nao aceitos
*_________________________________________
* 2 3 2 6           | Valores aceitos
*                   
                   
REPORT zgcs_TesteDeSelecao1.

SELECTION-SCREEN: BEGIN OF BLOCK b01 WITH FRAME TITLE TEXT-b01. "Preencha os dados abaixo:
PARAMETERS: s_a TYPE i OBLIGATORY,
            s_b TYPE i OBLIGATORY,
            s_c TYPE i OBLIGATORY,
            s_d TYPE i OBLIGATORY.

SELECTION-SCREEN: END OF BLOCK b01.

INITIALIZATION.
AT SELECTION-SCREEN.
START-OF-SELECTION.

  IF ( s_b > s_c ) AND ( s_d > s_a ) AND ( ( s_c + s_d ) > ( s_a + s_b ) AND ( s_d >= 0 AND s_c >= 0 ) AND ( s_a MOD 2 = 0 ) ).
    WRITE | Valores aceitos |.
  ELSE.
    WRITE | Valores nao aceitos |.
  ENDIF.
  
  
