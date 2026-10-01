# Links  e Referências
- Links simples e com texto personalizado
- Links de referência
- Links de internoss (ãncora)
- Links para email e telefones

## Links Simples e com texto personalizado
Os links são criados usando a seguinte sintaxe

```markdown
[Texto a ser exebiido](link)
```

[Google](www.google.com) 

## Links de Refência 
Os links de referência permitem que você um link uma vez e reutilize em várias partes do seu documento. A sintaxe é a seguinte:

``` markdown
[Texto exibido][1]
[1]:www.linkdestino.com
```

[Google][1]
[Google][2][1]

[1]:www.google.com

## Links internos (ãncoras)
Os links internos (ãncoras) permiter que você crie links que navegam para outras partes do documento. A Sintaxe é a seguinte :

``` markdown
[Texto exibido](#referencia)
```
Exemplo : 
[Ir para a Seção 1](#secao-um)
## Seção (#secao-um)
## Links para Email e telefone
Os Links para email e telefones permitem que você crie links que abrem um cliente de email ou discam um numero de telefone. A sintaxe é a seguinte:

``` markdown
[Link para email](mailto:vedilson@gmail.com)
[Link para telefone](tel:+5511999999999)
```