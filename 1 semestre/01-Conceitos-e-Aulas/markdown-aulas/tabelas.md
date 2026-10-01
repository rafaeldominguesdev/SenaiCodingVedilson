# Tabelas e Estrutura
- Sintaxe Básica de tabelas
- Alinhamentos de colunas
- Tabelas Complexas
- Limitações e alternativas
- Tabela HTML

## Sintaxe Básica de Tabelas
Para criar uma tabela em markdown, você pode usar o seguinte formato :

```markdown
| Cabeçalho 1 | Cebeçalho 2 | Cabeçalho 3 | 
|-------------|-------------|-------------|
| Linha1 Col1 | Linha1 Col2 | Linha1 Col3 |
| Linha1 Col1 | Linha1 Col2 | Linha1 Col3 |

```

## Exemplo 

| Nome        | Idade       | Cidade      | 
|-|-|-|
| João        | 25          | São Paulo   |
| Antonieta   | 102         | Birigui     |


## Alinhamento de Colunas
Você pode alinhar o conteúdo das colunas usando (`:`) na linha de separação

```markdown

| Esquerda  | Centro | Direita |
| :-------  | :----: | ------: |

```

### Exemplo
| Produto  | Ativo | Valor|
| :- | :-: | -: |
| Banna | Sim  | R$ 15,00 |
| Abôbora Kambotiã | Não | R$ 2680,00 |
| **Total**  | | R$ 2695,00 |

## Tabelas Complexas 
Para criar tabeals mais complexas, você pode combinar várias técnicas, como mesclar células ( embora o markdown padrão não suporte isso diretamente ) ou adicionar formatação adicional dentro da célula.

### Exemplo 

| Produto  | Ativo | Valor|
| :- | :-: | -: |
| Banna | Sim  | R$ 15,00 |
| Abôbora Kambotiã | Não | R$ 2680,00 |
| **Total**  | | R$ 2695,00 |

## Limitações e Alternativas 
O markdown padrão tem algumas limitações quando se trata de tabelas , como a incapacidade de mesclar células ou adicionar estilo avançados. para superar essas limitações voce pode considerar: 
- Usar Html dentro do markdown para criar tabelas mais complexas
- Utilizar extensões  de markdown que suportam funcionalidades
adicionais.
- Exportar para formatos que suportam tabelas avançacdas, como Latex ou HTML

```html
<table>
    <tr>
        </tr>

</table>

```