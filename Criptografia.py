# Solicitaram para que você construisse um programa simples de criptografia. Este programa deve possibilitar 
# enviar mensagens codificadas sem que alguém consiga lê-las. O processo é muito simples. São feitas três 
# passadas em todo o texto. Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas 
# devem ser deslocadas 3 posições para a direita, segundo a tabela ASCII: letra 'a' deve virar letra 'd', letra 
# 'y' deve virar caractere '|' e assim sucessivamente. Na segunda passada, a linha deverá ser invertida. Na 
# terceira e última passada, todo e qualquer caractere a partir da metade em diante (truncada) devem ser 
# deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'. Por exemplo, 
# se a entrada for “Texto #3”, o primeiro processamento sobre esta entrada deverá produzir “Wh{wr #3”. O 
# resultado do segundo processamento inverte os caracteres e produz “3# rw{hW”. Por último, com o deslocamento 
# dos caracteres da metade em diante, o resultado final deve ser “3# rvzgV”.

# Entrada:
# A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro 
# N (1 ≤ N ≤ 1*104), indicando a quantidade de linhas que o problema deve tratar. As N linhas contém cada uma 
# delas M (1 ≤ M ≤ 1*103) caracteres.

# Saída:
# Para cada entrada, deve-se apresentar a mensagem criptografada.
# 
#       input        |      output
# ___________________|_____________________
# Texto #3           |  3# rvzgV
# ___________________|_____________________
# abcABC1            |  1FECedc
# ___________________|_____________________
# vxpdylY .ph        |  ks. \n{frzx
# ___________________|_____________________
# vv.xwfxo.fd        |  gi.r{hyz-xx
#                      

frase = input("Digit something to be encrypted:")

#if it is a letter must turn into the ascii Symbol deslocated 3 characters
i = 0
while i < len(frase):
    if frase[i].isalpha():
        if frase[i].isupper() or frase[i].islower:
            letra3 = chr(ord(frase[i]) + 3)
            frase = frase.replace(frase[i], str(letra3))
    i = i + 1

# reverse sentence
frase = frase[::-1]

# split half of the sentence
half1 = frase[:len(frase)//2]
half2 = frase[len(frase)//2:]

# the second half must turn into the ascii Symbol deslocated -1 characters
i = 0
while i < len(half2):
    letra1 = chr( (ord(half2[i])) - 1)
    half2 = half2.replace(half2[i], str(letra1))
    i = i + 1

# concatenated sentences again
frase = half1 + half2
print("\nEncrypted message: " + frase)
