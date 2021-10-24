# Fruits
## Приложение, предсказывающее сорт фрукта/овоща, используя обученную модель нейронной сети

### Компоненты программы:

Приложение на языке Kotlin

Сервер на языке Python, работающий с моделью нейронной сети

### Работа программы:

Взаимодействие мобильного приложения и сервера происходит следующим образом:

В мобильном приложении открывается камера, делается снимок и отправляется на сервер. Сервер, в свою очередь, делает необходимую предобработку картинки, с помощью библиотеки OpenCV. Далее сервер прогоняет изображение через модель нейронной сети и полученное предсказание отправляет обратно в мобильное приложение, где происходит визуализация на экране.

![WjgPYL0qiW0](https://user-images.githubusercontent.com/56773665/138597822-378b6e7a-4934-437b-994e-6e2202a1da64.jpg)
