# Imagens e Mídia 
- Inserir imagens
- Imagens com links
- Controle de tamanho 
- Alt Text  para acessibilidade
- Videos do Youtube


## Insenrido Imagens
Para inserir imagens em markdown, você pode usar a seguinte sintaxe:

``` markdown
![Texto Alternativo]:(caminho/imagem.jpg)
```


![LionelMessi-CristianoRonaldo](./top.jgp)

## Imagens com links

Você pode tornar uma imagem clicável, vinculando-a a uma URL.
A sintaxe é a seguinte:

``` markdown

### Exemplo :

![Texto Alternativo](imagem)

[Texto Clicavel](URL)

[![Texto Alternativo](imagem)](URL)

```

### Exemplo Real
[![LionelMessi-CristianoRonaldo](./top.jgp)](https://assets.goal.com/images/v3/blt31170d753be01ad5/GOAL%20-%20Multiple%20Images%20-%202%20Split%20-%20Facebook%20-%202025-11-05T111206.292.jpg?auto=webp&format=pjpg&width=3840&quality=60)


## Controlando Tamanho
Nem todos os renderizados de markdown suportam controle de tamanho diretamente. No entanto, vcê pode usar HTML  para definir o tamanho da imagem:

```html

<img src="./top.jpg" alt ="Cristiano&Messi" width="300">


```

### Exemplo Real:
<img src="./top.jgp" alt ="Cristiano&Messi" width="300">


## Texto Alternativo

O texto alternativo (Alt Text) é importan do te para acessiblidade, pois descreve a imagem para leitores de tela. Sempre incluam um texto descritivo relevante.

## Vídeos  do Youtube

Para imcoporar um video do Youtube em  markdown, você pode utilizar HTML, já que a sintaxe padrão do markdown não suporta incorporar um video

```html
<iframe
    width="560"
    heigth="315"
    src="www.youtube.com.br/embed/VIDEO_ID"
    frameborder="0"
    allowfullscreen
></iframe>
```

### Exemplo Real:

<iframe width="560" height="315" src="https://www.youtube.com/embed/5wmgbktpUog?si=xXyKHQluAa6kOXRk" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>