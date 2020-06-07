I) testy na granicy akceptowanego zakresu
1. uzytkownik ustawia ocene 1
2. uzytkownik ustawia ocene 5
II) testy poza granica akceptowanego zakresu
3. uzytkownik ustawia ocene 0 -> 1
3b. uzytkownik ustawia ocene -1 -> 1
4. uzytkownik ustawia ocene 6 -> 5
III) 5. utworzenie obiektu 

1. user_sets_score_in_lower_range
2. user_sets_score_in_upper_range
3. user_sets_score_under_lower_range
3b. user_sets_negative_score
4. user_sets_score_above_upper_range
5. create

Notka dot notacji
CamelCase
userAddsTwoBooksToCartWhichAlreadyHas5BooksAndTotalNumberOfBooksIs7

Python //C++ 1000x == Java 300x === Python 30x
user_adds_two_books_to_cart_which_already_has_5_books_and_total_number_of_books_is_7

- - - Przypadki testowe dla Cw. 4
create -> z zadanym czasem
create -> 00:00

in-range:
min hour -> 0
max hour -> 23
min minutes -> 0
max minutes -> 59

out-range:
hour < 0
hour > 23
minutes < 0
minutes > 59

//addHours, addMinutes
01:30 + 29min -> 01:59
01:30 + 31min -> 02:01
01:30 + 30min -> 02:00
23:59 + 1min -> 00:00
22:22 + 300min -> 03:22

01:30 - 1h -> 01:30
01:30 - 30min -> 01:30

//addClock
01:30 + 01:30 -> 03:00
01:30 + 2:30 -> 04:00
01:30 + 4:29 -> 5:59
23:30 + 02:00 -> 01:30
05:00 + null -> 05:00
null + 05:00 -> NPE

Clock c = null;
c.addClock(new Clock(10,30)); -> NPE