# telegram-bot
📌 Telegram Bot на Java
Простой Telegram-бот, написанный на Java с использованием Maven и библиотеки TelegramBots API.

📜 Описание
Этот бот принимает сообщения от пользователей и отвечает тем же текстом. Он работает на основе Telegram Long Polling API и использует telegrambots для взаимодействия с Telegram.

🚀 Установка и запуск

1. Подготовка
   
Убедитесь, что у вас установлены:

Java 11+ (скачать JDK)

Maven (скачать Maven)

2. Создание бота в Telegram
Откройте Telegram и найдите @BotFather.
Отправьте команду:

/newbot

Придумайте имя и уникальный username (должен заканчиваться на bot).

Сохраните полученный API-токен.
4. Клонирование проекта

git clone https://github.com/ВАШ_ЮЗЕРНЕЙМ/telegram-bot-java.git
cd telegram-bot-java
5. Настройка токена
Откройте файл MyBot.java и вставьте 

@Override
public String getBotToken() {
    return "ВАШ_ТОКЕН_ОТ_BOTFATHER";
}
5. Сборка и запуск

mvn clean install
mvn exec:java -Dexec.mainClass="org.example.Main"
Если всё сделано правильно, в консоли появится:

Бот успешно запущен!
🛠 Используемые технологии
Java 11+
Мавен
API телеграмботов
SLF4J (логирование)
📌 Файловая структура

telegram-bot/
│── src/
│   ├── main/
│   │   ├── java/org/example/
│   │   │   ├── Main.java         # Точка входа
│   │   │   ├── MyBot.java        # Логика бота
│   ├── resources/
│── pom.xml                        # Maven-зависимости
│── README.md                      # Документация
📝 Лицензия
Этот проект распространяется под лицензией MIT.
