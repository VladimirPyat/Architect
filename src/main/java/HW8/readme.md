<H3>Приложение для заказа столиков</H3>
Приложение должно реализовывать функционал, который обсуждали на уроке. Возможно какие-то мелкие детали не учел. Структура в соответствии с паттерном MVC.

_View_ - отображает экранные формы в соответствии с UI: логин, регистрация, список столов, форма заказа.

_Controller_ состоит из 4х классов:

1. ClientController - содержит методы регистрации и авторизации клиента, доступ к его данным и изменение
2.  OrderController - содержит методы обработки заказов: создание, отображение, поиск и отмена заказов.
3. TableController - методы для работы со столами: поиск и отображение информации о столах.
4. DataBaseController - методы работы с базой данных.

_Model_ включает в себя
1. Customer - логин, пароль и личные данные клиенты
2. Table - количество мест за столом, в каком зале находится стол
3. Order - содержит данные о том, какие столы кем заказаны и на какое время