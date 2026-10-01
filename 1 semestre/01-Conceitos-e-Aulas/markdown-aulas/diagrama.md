# Diagrama 

## Mermaid
Mermaid é uma ferramenta poderosa que permite criar diagramas e fluxogramas a partir de texto simples, utilizando uma sintaxe específica. Integrar Mermaid em seus documentos markdown
pode enriqueccer a apresetnacao de  informações complexas de maneira visual.

```mermaid
graph TD
    A[Inicio] --> B{Decisão}
    B --> |SIM| C[Processo 1]
    B --> |NAO| D[Processo 2]
    C --> F[Fim]
    D --> F[Fim]
```

```mermaid
gantt
    title Projeto Exemplo
    dateFormat  YYYY-MM-DD
    section Desenvolvimento
    Tarefa 1        :a1, 2023-01-01,
    Tarefa 2        :after a1, 20d
    section  Testes
    Teste 1         : 2023-02-15 , 12d
    Teste 2         : 24d

``` 
