-- Заполнение таблицы CUSTOMERS
INSERT INTO CUSTOMERS (name, surname, age, phone_number) VALUES
                                                             ('Ivan', 'Ivanov', 30, '89001234567'),
                                                             ('Petr', 'Petrov', 25, '89002345678'),
                                                             ('Sergey', 'Sergeev', 40, '89003456789'),
                                                             ('Alexey', 'Alexeev', 35, '89004567890'),
                                                             ('Dmitry', 'Dmitriev', 29, '89005678901'),
                                                             ('Mikhail', 'Mikhailov', 33, '89006789012'),
                                                             ('Andrey', 'Andreev', 50, '89007890123'),
                                                             ('Vladimir', 'Vladimirov', 45, '89008901234'),
                                                             ('Oleg', 'Olegov', 28, '89009123456'),
                                                             ('Maxim', 'Maximov', 38, '89010234567');

-- Заполнение таблицы ORDERS
INSERT INTO ORDERS (date, customer_id, product_name, amount) VALUES
                                                                 ('2024-12-01', 1, 'Laptop', 55000),
                                                                 ('2024-11-20', 2, 'Smartphone', 25000),
                                                                 ('2024-10-15', 3, 'Tablet', 15000),
                                                                 ('2024-12-02', 4, 'Headphones', 3000),
                                                                 ('2024-11-10', 5, 'Monitor', 12000),
                                                                 ('2024-09-05', 6, 'Keyboard', 2000),
                                                                 ('2024-12-01', 7, 'Mouse', 1500),
                                                                 ('2024-08-25', 8, 'Printer', 8000),
                                                                 ('2024-10-10', 9, 'Webcam', 3500),
                                                                 ('2024-11-28', 10, 'Smartwatch', 8000);
