# Diseño de Pruebas

El diseño de pruebas es un proceso esencial en el desarrollo de software que garantiza la calidad y confiabilidad de un sistema. En este contexto, se presenta una serie de pruebas unitarias para el proyecto. Estos tests abordan diversos escenarios para validar el comportamiento esperado de las funciones en situaciones específicas.

### Pruebas Unitarias para `stringToAsciiList`

A continuación se presenta una tabla que resume los casos de prueba diseñados para la función `stringToAsciiList`:

| Caso de Prueba | Entrada                                   | Salida Esperada                                 | Descripción                                                                                   |
|----------------|-------------------------------------------|-------------------------------------------------|-----------------------------------------------------------------------------------------------|
| Test 1         | `("", 2)`                                 | `debería ser vacío`                             | Una cadena vacía debería devolver una lista vacía.                                             |
| Test 2         | `("abc", 5)`                              | `debería ser Lista(97, 98, 99)`                 | Un tamaño de bloque mayor que la longitud de la cadena debería devolver una lista con los valores ASCII de los caracteres.                                |
| Test 3         | `("hello", 5)`                            | `debería ser Lista(104, 101, 108, 108, 111)`    | Un tamaño de bloque igual a la longitud de la cadena debería devolver una lista con los valores ASCII de los caracteres.                                    |
| Test 4         | `("hello", 2)`                            | `debería ser Lista(104, 101, 108, 108, 111)`    | Un tamaño de bloque menor que la longitud de la cadena debería devolver una lista con los valores ASCII de los caracteres en bloques.                      |
| Test 5         | `("!@#$", 2)`                             | `debería ser Lista(33, 64, 35, 36)`             | Los caracteres especiales en la cadena deberían convertirse a valores ASCII.                    |
| Test 6         | `("HelloWorld", 3)`                       | `debería ser Lista(72, 101, 108, 108, 111, 87, 111, 114, 108, 100)` | Mezcla de caracteres en mayúsculas y minúsculas en la cadena.                                       |



# DualCheckSum
## Pruebas Unitarias para `calculateCheckSum`

### TOY DATA

| Caso de Prueba | Descripción                                                          | Entrada                                   | Salida Esperada       |
|----------------|----------------------------------------------------------------------|-------------------------------------------|-----------------------|
| Test 1         | Calcular el checksum para una cadena de datos 1 (TOY)               | `(toyData.head, BLOCKSIZE)`               | `"10841543249"`      |
| Test 2         | Calcular el checksum para una cadena de datos 2 (TOY)               | `(toyData(1), BLOCKSIZE)`                 | `"10627531803"`      |
| Test 3         | Calcular el checksum para una cadena de datos 3 (TOY)               | `(toyData(2), BLOCKSIZE)`                 | `"10786541006"`      |
| Test 4         | Calcular el checksum para una cadena de datos 4 (TOY)               | `(toyData(3), BLOCKSIZE)`                 | `"11046551305"`      |
| Test 5         | Calcular el checksum para una cadena de datos 5 (TOY)               | `(toyData(4), BLOCKSIZE)`                 | `"10796539751"`      |
| Test 6         | Calcular el checksum para una cadena de datos 6 (TOY)               | `(toyData(5), BLOCKSIZE)`                 | `"10738537774"`      |
| Test 7         | Calcular el checksum para una cadena de datos 7 (TOY)               | `(toyData(6), BLOCKSIZE)`                 | `"10905545018"`      |
| Test 8         | Calcular el checksum para una cadena de datos 8 (TOY)               | `(toyData(7), BLOCKSIZE)`                 | `"10710538661"`      |
| Test 9         | Calcular el checksum para una cadena de datos 9 (TOY)               | `(toyData(8), BLOCKSIZE)`                 | `"10960549773"`      |
| Test 10        | Calcular el checksum para una cadena de datos 10 (TOY)              | `(toyData(9), BLOCKSIZE)`                 | `"10774537549"`      |

### PEQUEÑA DATA

| Caso de Prueba | Descripción                                                          | Entrada                                   | Salida Esperada          |
|----------------|----------------------------------------------------------------------|-------------------------------------------|--------------------------|
| Test 1         | Calcular el checksum para una cadena de datos 1 (PEQUEÑA)           | `(pequenaData.head, BLOCKSIZE)`           | `"109429768440770"`     |
| Test 2         | Calcular el checksum para una cadena de datos 2 (PEQUEÑA)           | `(pequenaData(1), BLOCKSIZE)`             | `"109344169405830"`     |
| Test 3         | Calcular el checksum para una cadena de datos 3 (PEQUEÑA)           | `(pequenaData(2), BLOCKSIZE)`             | `"109456174064500"`     |
| Test 4         | Calcular el checksum para una cadena de datos 4 (PEQUEÑA)           | `(pequenaData(3), BLOCKSIZE)`             | `"109443674899628"`     |
| Test 5         | Calcular el checksum para una cadena de datos 5 (PEQUEÑA)           | `(pequenaData(4), BLOCKSIZE)`             | `"109475076726345"`     |
| Test 6         | Calcular el checksum para una cadena de datos 6 (PEQUEÑA)           | `(pequenaData(5), BLOCKSIZE)`             | `"109615382713325"`     |
| Test 7         | Calcular el checksum para una cadena de datos 7 (PEQUEÑA)           | `(pequenaData(6), BLOCKSIZE)`             | `"109523780155719"`     |
| Test 8         | Calcular el checksum para una cadena de datos 8 (PEQUEÑA)           | `(pequenaData(7), BLOCKSIZE)`             | `"109440070929205"`     |
| Test 9         | Calcular el checksum para una cadena de datos 9 (PEQUEÑA)           | `(pequenaData(8), BLOCKSIZE)`             | `"109474972742624"`     |
| Test 10        | Calcular el checksum para una cadena de datos 10 (PEQUEÑA)          | `(pequenaData(9), BLOCKSIZE)`             | `"109507075993250"`     |

### MEDIANA DATA

| Caso de Prueba | Descripción                                                          | Entrada                                   | Salida Esperada           |
|----------------|----------------------------------------------------------------------|-------------------------------------------|---------------------------|
| Test 1         | Calcular el checksum para una cadena de datos 1 (MEDIANA)           | `(data.head, BLOCKSIZE)`                  | `"1094951341438744"`     |
| Test 2         | Calcular el checksum para una cadena de datos 2 (MEDIANA)           | `(data(1), BLOCKSIZE)`                    | `"1094637948967238"`     |
| Test 3         | Calcular el checksum para una cadena de datos 3 (MEDIANA)           | `(data(2), BLOCKSIZE)`                    | `"1095006252366260"`     |
| Test 4         | Calcular el checksum para una cadena de datos 4 (MEDIANA)           | `(data(3), BLOCKSIZE)`                    | `"1095006058221744"`     |
| Test 5         | Calcular el checksum para una cadena de datos 5 (MEDIANA)           | `(data(4), BLOCKSIZE)`                    | `"1095006698725352"`     |
| Test 6         | Calcular el checksum para una cadena de datos 6 (MEDIANA)           | `(data(5), BLOCKSIZE)`                    | `"1095207238148627"`     |
| Test 7         | Calcular el checksum para una cadena de datos 7 (MEDIANA)           | `(data(6), BLOCKSIZE)`                    | `"1095325098668244"`     |
| Test 8         | Calcular el checksum para una cadena de datos 8 (MEDIANA)           | `(data(7), BLOCKSIZE)`                    | `"1095084774607112"`     |
| Test 9         | Calcular el checksum para una cadena de datos 9 (MEDIANA)           | `(data(8), BLOCKSIZE)`                    | `"1094947587753748"`     |
| Test 10        | Calcular el checksum para una cadena de datos 10 (MEDIANA)          | `(data(9), BLOCKSIZE)`                    | `"1095026761480649"`     |

### GRANDE DATA

| Caso de Prueba | Descripción                                                          | Entrada                                   | Salida Esperada          |
|----------------|----------------------------------------------------------------------|-------------------------------------------|--------------------------|
| Test 1         | Calcular el checksum para una cadena de datos 1 (GRANDE)            | `(data.head, BLOCKSIZE)`                  | `"950106727819454"`     |
| Test 2         | Calcular el checksum para una cadena de datos 2 (GRANDE)            | `(data(1), BLOCKSIZE)`                    | `"949803470392758"`     |
| Test 3         | Calcular el checksum para una cadena de datos 3 (GRANDE)            | `(data(2), BLOCKSIZE)`                    | `"950863345297952"`     |
| Test 4         | Calcular el checksum para una cadena de datos 4 (GRANDE)            | `(data(3), BLOCKSIZE)`                    | `"950106512788553"`     |
| Test 5         | Calcular el checksum para una cadena de datos 5 (GRANDE)            | `(data(4), BLOCKSIZE)`                    | `"949298784272845"`     |
| Test 6         | Calcular el checksum para una cadena de datos 6 (GRANDE)            | `(data(5), BLOCKSIZE)`                    | `"950718180702316"`     |
| Test 7         | Calcular el checksum para una cadena de datos 7 (GRANDE)            | `(data(6), BLOCKSIZE)`                    | `"950111690426695"`     |
| Test 8         | Calcular el checksum para una cadena de datos 8 (GRANDE)            | `(data(7), BLOCKSIZE)`                    | `"950720553181835"`     |
| Test 9         | Calcular el checksum para una cadena de datos 9 (GRANDE)            | `(data(8), BLOCKSIZE)`                    | `"950422828582577"`     |
| Test 10        | Calcular el checksum para una cadena de datos 10 (GRANDE)           | `(data(9), BLOCKSIZE)`                    | `"950189743780779"`     |



# SingleCheckSum
## Pruebas Unitarias para `calculateCheckSum`



### Toy Data

| Caso de Prueba | Descripción                                      | Entrada                         | Salida Esperada   |
|-----------------|--------------------------------------------------|---------------------------------|-------------------|
| Test 1          | Calcular el checksum para una cadena de datos 1 | `(data.head, BLOCKSIZE)`       | `"10841"`         |
| Test 2          | Calcular el checksum para una cadena de datos 2 | `(data(1), BLOCKSIZE)`         | `"10627"`         |
| Test 3          | Calcular el checksum para una cadena de datos 3 | `(data(2), BLOCKSIZE)`         | `"10786"`         |
| Test 4          | Calcular el checksum para una cadena de datos 4 | `(data(3), BLOCKSIZE)`         | `"11046"`         |
| Test 5          | Calcular el checksum para una cadena de datos 5 | `(data(4), BLOCKSIZE)`         | `"10796"`         |
| Test 6          | Calcular el checksum para una cadena de datos 6 | `(data(5), BLOCKSIZE)`         | `"10738"`         |
| Test 7          | Calcular el checksum para una cadena de datos 7 | `(data(6), BLOCKSIZE)`         | `"10905"`         |
| Test 8          | Calcular el checksum para una cadena de datos 8 | `(data(7), BLOCKSIZE)`         | `"10710"`         |
| Test 9          | Calcular el checksum para una cadena de datos 9 | `(data(8), BLOCKSIZE)`         | `"10960"`         |
| Test 10         | Calcular el checksum para una cadena de datos 10| `(data(9), BLOCKSIZE)`         | `"10774"`         |


### Pequeña Data

| Caso de Prueba | Descripción                                      | Entrada                         | Salida Esperada   |
|-----------------|--------------------------------------------------|---------------------------------|-------------------|
| Test 1          | Calcular el checksum para una cadena de datos 1 | `(data.head, BLOCKSIZE)`       | `"1094297"`       |
| Test 2          | Calcular el checksum para una cadena de datos 2 | `(data(1), BLOCKSIZE)`         | `"1093441"`       |
| Test 3          | Calcular el checksum para una cadena de datos 3 | `(data(2), BLOCKSIZE)`         | `"1094561"`       |
| Test 4          | Calcular el checksum para una cadena de datos 4 | `(data(3), BLOCKSIZE)`         | `"1094436"`       |
| Test 5          | Calcular el checksum para una cadena de datos 5 | `(data(4), BLOCKSIZE)`         | `"1094750"`       |
| Test 6          | Calcular el checksum para una cadena de datos 6 | `(data(5), BLOCKSIZE)`         | `"1096153"`       |
| Test 7          | Calcular el checksum para una cadena de datos 7 | `(data(6), BLOCKSIZE)`         | `"1095237"`       |
| Test 8          | Calcular el checksum para una cadena de datos 8 | `(data(7), BLOCKSIZE)`         | `"1094400"`       |
| Test 9          | Calcular el checksum para una cadena de datos 9 | `(data(8), BLOCKSIZE)`         | `"1094749"`       |
| Test 10         | Calcular el checksum para una cadena de datos 10| `(data(9), BLOCKSIZE)`         | `"1095070"`       |


### Mediana Data

| Caso de Prueba | Descripción                                      | Entrada                         | Salida Esperada   |
|-----------------|--------------------------------------------------|---------------------------------|-------------------|
| Test 1          | Calcular el checksum para una cadena de datos 1 | `(data.head, BLOCKSIZE)`       | `"10949513"`      |
| Test 2          | Calcular el checksum para una cadena de datos 2 | `(data(1), BLOCKSIZE)`         | `"10946379"`      |
| Test 3          | Calcular el checksum para una cadena de datos 3 | `(data(2), BLOCKSIZE)`         | `"10950062"`      |
| Test 4          | Calcular el checksum para una cadena de datos 4 | `(data(3), BLOCKSIZE)`         | `"10950060"`      |
| Test 5          | Calcular el checksum para una cadena de datos 5 | `(data(4), BLOCKSIZE)`         | `"10950066"`      |
| Test 6          | Calcular el checksum para una cadena de datos 6 | `(data(5), BLOCKSIZE)`         | `"10952072"`      |
| Test 7          | Calcular el checksum para una cadena de datos 7 | `(data(6), BLOCKSIZE)`         | `"10953250"`      |
| Test 8          | Calcular el checksum para una cadena de datos 8 | `(data(7), BLOCKSIZE)`         | `"10950847"`      |
| Test 9          | Calcular el checksum para una cadena de datos 9 | `(data(8), BLOCKSIZE)`         | `"10949475"`      |
| Test 10         | Calcular el checksum para una cadena de datos 10| `(data(9), BLOCKSIZE)`         | `"10950267"`      |


### Grande Data

| Caso de Prueba | Descripción                                      | Entrada                         | Salida Esperada   |
|-----------------|--------------------------------------------------|---------------------------------|-------------------|
| Test 1          | Calcular el checksum para una cadena de datos 1 | `(data.head, BLOCKSIZE)`       | `"9501067"`       |
| Test 2          | Calcular el checksum para una cadena de datos 2 | `(data(1), BLOCKSIZE)`         | `"9498034"`       |
| Test 3          | Calcular el checksum para una cadena de datos 3 | `(data(2), BLOCKSIZE)`         | `"9508633"`       |
| Test 4          | Calcular el checksum para una cadena de datos 4 | `(data(3), BLOCKSIZE)`         | `"9501065"`       |
| Test 5          | Calcular el checksum para una cadena de datos 5 | `(data(4), BLOCKSIZE)`         | `"9492987"`       |
| Test 6          | Calcular el checksum para una cadena de datos 6 | `(data(5), BLOCKSIZE)`         | `"9507181"`       |
| Test 7          | Calcular el checksum para una cadena de datos 7 | `(data(6), BLOCKSIZE)`         | `"9501116"`       |
| Test 8          | Calcular el checksum para una cadena de datos 8 | `(data(7), BLOCKSIZE)`         | `"9507205"`       |
| Test 9          | Calcular el checksum para una cadena de datos 9 | `(data(8), BLOCKSIZE)`         | `"9504228"`       |
| Test 10         | Calcular el checksum para una cadena de datos 10| `(data(9), BLOCKSIZE)`         | `"9501897"`       |




