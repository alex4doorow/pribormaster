INSERT INTO oc_country (country_id, name, iso_code_2, iso_code_3, address_format, postcode_required, status) VALUES(20, 'Белоруссия (Беларусь)', 'BY', 'BLR', '', 0, 0);
INSERT INTO oc_country (country_id, name, iso_code_2, iso_code_3, address_format, postcode_required, status) VALUES(80, 'Грузия', 'GE', 'GEO', '', 0, 0);
INSERT INTO oc_country (country_id, name, iso_code_2, iso_code_3, address_format, postcode_required, status) VALUES(109, 'Казахстан', 'KZ', 'KAZ', '', 0, 0);
INSERT INTO oc_country (country_id, name, iso_code_2, iso_code_3, address_format, postcode_required, status) VALUES(115, 'Киргизия (Кыргызстан)', 'KG', 'KGZ', '', 0, 0);
INSERT INTO oc_country (country_id, name, iso_code_2, iso_code_3, address_format, postcode_required, status) VALUES(176, 'Российская Федерация', 'RU', 'RUS', '', 0, 1);
INSERT INTO oc_country (country_id, name, iso_code_2, iso_code_3, address_format, postcode_required, status) VALUES(220, 'Украина', 'UA', 'UKR', '', 0, 0);
INSERT INTO oc_country (country_id, name, iso_code_2, iso_code_3, address_format, postcode_required, status) VALUES(226, 'Узбекистан', 'UZ', 'UZB', '', 0, 0);

INSERT INTO oc_currency (currency_id, title, code, symbol_left, symbol_right, decimal_place, value, status, date_modified) VALUES(2, 'US Dollar', 'USD', '$', '', '2', 0.01397, 0, '2020-08-22 10:46:29');
INSERT INTO oc_currency (currency_id, title, code, symbol_left, symbol_right, decimal_place, value, status, date_modified) VALUES(4, 'Рубль', 'RUB', '', ' ₽', '2', 1.0, 1, '2023-03-18 17:55:01');

INSERT INTO oc_language (language_id, name, code, locale, image, directory, sort_order, status) VALUES(1, 'EN ', 'en-gb', 'en-US,en_US.UTF-8,en_US,en-gb,english', 'gb.png', 'english', 2, 0);
INSERT INTO oc_language (language_id, name, code, locale, image, directory, sort_order, status) VALUES(2, 'RU ', 'ru-ru', 'ru_RU.UTF-8,ru_RU,russian', '', '', 1, 1);

INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(11, 'СОЭКС', 'catalog/2logo-brands/soeks.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(12, 'Мастер Кит', 'catalog/2logo-brands/chudo-kit.png', 1011, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(13, 'SEGA TOYS', 'catalog/2logo-brands/sega-toys.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(14, 'Bushnell', 'catalog/2logo-brands/bushnell.png', 1009, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(15, 'Harper', 'catalog/2logo-brands/harper.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(16, 'Sapsan', 'catalog/2logo-brands/sapsan.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(17, 'ЧУДОКИТ', 'catalog/2logo-brands/master-kit.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(18, 'TANTOS', 'catalog/2logo-brands/tantos.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(19, 'Даджет', 'catalog/2logo-brands/dadget.png', 0, 'Россия', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(20, 'Falcon Eye', 'catalog/2logo-brands/falcon-eyes.png', 1010, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(22, 'Китай', 'catalog/2logo-brands/kitaj.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(21, 'Medisana', 'catalog/2logo-brands/medisana.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(5, 'ЭКОСНАЙПЕР', 'catalog/2logo-brands/ehkosnajper.png', 0, 'Россия', 'Тайвань');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(6, 'Hobot Technology', 'catalog/2logo-brands/hobot-technology.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(7, 'iSocket', 'catalog/2logo-brands/isocket.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(8, 'SITITEK', 'catalog/2logo-brands/sititek.png', 0, 'Россия', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(9, 'ООО Айфо-Технолоджи', 'catalog/2logo-brands/ooo-ajfo-tekhnolodzhi.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(10, 'Weitech', 'catalog/2logo-brands/weitech.png', 0, 'Бельгия', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(23, 'Kingston', 'catalog/2logo-brands/kingston.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(24, 'Dazer', 'catalog/2logo-brands/dazer.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(25, 'Wenger', 'catalog/2logo-brands/wenger.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(26, 'Locus', 'catalog/2logo-brands/locus.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(27, 'Сибирский Арсенал', 'catalog/2logo-brands/sibirskij-arsenal.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(28, 'Bondic', 'catalog/2logo-brands/bondic.png', 1008, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(29, 'ЭЛАНГ', 'catalog/2logo-brands/elang.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(30, 'Senseit', 'catalog/2logo-brands/senseit.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(31, 'Гонконг', 'catalog/2logo-brands/gonkong.png', 0, 'Гонконг', 'Гонконг');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(32, 'CARKU', 'catalog/2logo-brands/carku.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(33, 'PROTEX', 'catalog/2logo-brands/protex.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(34, 'МикроАРТ', 'catalog/2logo-brands/mikroart.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(35, 'ThermaCELL', 'catalog/2logo-brands/thermacell.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(36, 'Camping World', 'catalog/2logo-brands/camping-world.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(37, 'Ultrathon', 'catalog/2logo-brands/ultrathon.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(38, 'Karcher', 'catalog/2logo-brands/karcher.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(39, 'Fiesta', 'catalog/2logo-brands/fiesta.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(40, 'Katadyn', 'catalog/2logo-brands/katadyn.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(41, 'Tiger', 'catalog/2logo-brands/tiger.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(42, 'Thermos', 'catalog/2logo-brands/thermos.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(43, 'Премьер Групп', 'catalog/2logo-brands/premer-grupp.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(44, 'Fiskars', 'catalog/2logo-brands/fiskars.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(45, 'Gerber', 'catalog/2logo-brands/gerber.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(46, 'Campingaz', 'catalog/2logo-brands/campingaz.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(48, 'Navixy', 'catalog/2logo-brands/navixy.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(49, 'Kurtbomsan', 'catalog/2logo-brands/kurtbomsan.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(50, 'Raksa', 'catalog/2logo-brands/raksa.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(51, 'Dazon', 'catalog/2logo-brands/dazon.png', 0, 'Нидерланды', 'Нидерланды');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(52, 'Hikvision', 'catalog/2logo-brands/hikvision.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(53, 'CONTIGO', 'catalog/2logo-brands/contigo.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(54, 'Bird Gard', 'catalog/2logo-brands/bird-gard.png', 0, 'США', 'США');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(55, 'Bird-X Inc', 'catalog/2logo-brands/bird-x-inc.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(56, 'Feather-Light Technologies LLC', 'catalog/2logo-brands/feather-light technologies.png', 0, 'США', 'США');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(57, 'Beward', 'catalog/2logo-brands/beward.png', 1007, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(58, 'Levenhuk', 'catalog/2logo-brands/levenhuk.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(59, 'IQtronic Tehnologies Europe LTD', 'catalog/2logo-brands/iqtronic-tehnologies-europe-ltd.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(60, 'Igloo', 'catalog/2logo-brands/igloo.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(61, 'Gezanne I.T.C.', 'catalog/2logo-brands/gezanne-i-t-c.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(62, 'PowerPot', 'catalog/2logo-brands/powerpot.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(63, 'Power Practical', 'catalog/2logo-brands/power-practical.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(64, 'Канонир', 'catalog/2logo-brands/kanonir.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(65, 'Trendwoo', 'catalog/2logo-brands/trendwoo.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(66, 'Sun-Power', 'catalog/2logo-brands/sun-power.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(67, 'Barocook', 'catalog/2logo-brands/barocook.png', 1005, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(68, 'Телеметрика', 'catalog/2logo-brands/telemetrika.png', 0, 'Россия', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(69, 'НИИ Прикладной Химии', 'catalog/2logo-brands/nii-prikladnoj-himii.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(70, 'Ладья', 'catalog/2logo-brands/ladia.png', 0, 'Россия', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(71, 'KIVOS', 'catalog/2logo-brands/kivos.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(72, 'Bestway', 'catalog/2logo-brands/bestway.png', 1006, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(73, 'Aqua-Vu', 'catalog/2logo-brands/aqua-vu.png', 1004, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(74, 'Практик', 'catalog/2logo-brands/praktik.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(75, 'Restube', 'catalog/2logo-brands/restube.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(76, 'Greettest Tehnology Co LTD', 'catalog/2logo-brands/greentest-tehnology.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(77, 'AfterShokz', 'catalog/2logo-brands/aftershokz.png', 1001, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(78, 'Ajax', 'catalog/2logo-brands/ajax.png', 1002, 'Украина', 'Украина');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(79, 'Болид', 'catalog/2logo-brands/bolid.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(80, 'Следопыт', 'catalog/2logo-brands/sledopyt.png', 0, 'Россия', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(81, 'Alonio', 'catalog/2logo-brands/alonio.png', 1003, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(82, 'Orcam', 'catalog/2logo-brands/orcam.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(83, 'Deger', 'catalog/2logo-brands/deger.png', 0, 'Турция', 'Турция');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(84, 'HONEYWELL', 'catalog/2logo-brands/honeywell.png', 0, 'Великобритания', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(85, 'IBOBBER', 'catalog/2logo-brands/IBOBBER.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(86, 'ReelSonar', 'catalog/2logo-brands/reelsonar.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(87, 'ISOTRONIC', 'catalog/2logo-brands/isotronic.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(88, 'ООО Квазар', 'catalog/2logo-brands/kvazar.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(89, 'Торнадо', 'catalog/2logo-brands/tornado.png', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(90, 'ТАНДЕР', 'catalog/2logo-brands/tander.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(92, 'Xiaomi', 'catalog/2logo-brands/xiaomi.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(93, 'Kugoo', 'catalog/2logo-brands/kugoo.png', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(94, 'HOONT', 'catalog/2logo-brands/hoont.png', 1, 'США', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(137, 'Кситал', '', 0, 'Россия', 'Россия');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(138, 'Miteless', '', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(139, 'Ospon', '', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(140, 'Ganzo', '', 0, 'КНР', 'КНР');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(141, 'ТМ Коршун', '', 0, 'Республика Беларусь', 'Республика Беларусь');
INSERT INTO oc_manufacturer (manufacturer_id, name, image, sort_order, country_brand, country_origin) VALUES(142, 'ТМ Петрович', '', 0, NULL, NULL);


INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(35, 'Автономный прибор от птиц WK-0020', 'WK-0020', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/bird/uz/wk-0020/Weitech_WK0020_1.jpg', 10, 1, 2990.0000, 0, 12, '2009-02-03', 5.00000000, 1, 0.00000000, 5.00000000, 0.00000000, 1, 1, 1, 111, 1, 7437, '2009-02-03 18:08:31', '2020-10-11 17:19:38', 103, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(29, 'Deluxe', '', '', '', '101', '', '', '', 999, 6, 'catalog/products/product-4.png', 12, 1, 60.0000, 0, 9, '2015-10-24', 1.10000000, 1, 0.00000000, 0.00000000, 0.00000000, 3, 1, 1, 0, 0, 0, '2015-02-03 16:42:17', '2020-08-16 21:05:51', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(30, 'Premium', '', '', '', '101', '', '', '', 59999, 6, 'catalog/products/product-7.png', 13, 1, 120.0000, 0, 9, '2015-10-23', 1.50000000, 1, 0.00000000, 0.00000000, 0.00000000, 1, 1, 1, 0, 0, 0, '2015-02-03 16:59:00', '2020-08-16 21:04:48', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(31, 'Collectible', '', '', '', '101', '', '', '', 998, 6, 'catalog/products/product-10.png', 14, 1, 30.0000, 0, 9, '2015-10-22', 2.00000000, 1, 0.00000000, 0.00000000, 0.00000000, 3, 1, 1, 0, 0, 0, '2015-02-03 17:00:10', '2020-08-16 21:05:27', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(33, 'Автономный отпугиватель ГРОМ ПРОФИ М', 'ГРОМ-ПРОФИ-М', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/mole/grom-profi-m/SITITEK_GROM-PROFI_M_8.jpg', 8, 1, 3650.0000, 0, 12, '2009-02-03', 520.00000000, 2, 0.00000000, 520.00000000, 0.00000000, 2, 1, 1, 2, 1, 10623, '2009-02-03 17:08:31', '2022-09-13 16:20:47', 101, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(34, 'Classic', '', '', '', '101', '', '', '', 999, 6, 'catalog/products/product-19.png', 17, 1, 120.0000, 0, 9, '2015-10-19', 3.00000000, 1, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 0, 0, 0, '2015-02-03 18:07:54', '2020-08-18 18:03:55', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(32, 'ЭкоСнайпер LS-107', 'LS-107', '', '', '101', '100', '', '', 1, 5, 'catalog/products/repeller/snake/ls-107/LS-107-6.jpg', 5, 1, 3784.0000, 0, 12, '2009-02-03', 498.00000000, 2, 42.00000000, 7.00000000, 7.00000000, 1, 1, 1, 1, 1, 22859, '2009-02-03 17:07:26', '2022-09-13 16:19:33', 102, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(28, 'ЭкоСнайпер LS-987BF', 'LS-987BF', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/bird/uz/ls-998bf/ekosnajper-ls-987bf-1.jpg', 5, 1, 6966.0000, 0, 12, '2009-02-03', 320.00000000, 2, 110.00000000, 100.00000000, 95.00000000, 2, 1, 1, 101, 1, 8572, '2009-02-03 16:06:50', '2022-03-02 11:17:42', 103, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(41, 'Premium', '', '', '', '101', '', '', '', 977, 5, 'catalog/products/product-31.png', 11, 1, 340.0000, 0, 9, '2015-10-15', 2.10000000, 1, 0.00000000, 0.00000000, 0.00000000, 1, 1, 1, 0, 0, 0, '2015-02-03 21:07:26', '2020-08-16 21:08:16', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(42, 'Collectible', '', '', '', '101', '', '', '', 988, 5, 'catalog/products/product-34.png', 12, 1, 60.0000, 400, 9, '2015-10-14', 1.80000000, 1, 0.00000000, 0.00000000, 0.00000000, 1, 1, 2, 0, 0, 1, '2015-02-03 21:07:37', '2020-08-16 21:08:41', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(43, 'Premium', '', '', '', '101', '', '', '', 929, 5, 'catalog/products/product-37.png', 13, 1, 130.0000, 0, 9, '2015-10-13', 1.20000000, 1, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 0, 0, 0, '2015-02-03 21:07:49', '2020-08-16 21:07:48', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(44, 'Deluxe', '', '', '', '101', '', '', '', 1000, 5, 'catalog/products/product-40.png', 14, 1, 170.0000, 0, 9, '2015-10-12', 1.90000000, 1, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 0, 0, 0, '2015-02-03 21:08:00', '2020-08-16 21:06:45', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(45, 'Collectible', '', '', '', '101', '', '', '', 998, 5, 'catalog/products/home/gsm-rozetki/isocket-707/GSM_rozetka_iSocket-707_0.jpg', 15, 1, 110.0000, 0, 0, '2015-10-11', 2.30000000, 1, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 0, 0, 0, '2015-02-03 21:08:17', '2020-08-16 21:07:02', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(46, 'Classic', '', '', '', '101', '', '', '', 1000, 5, 'catalog/products/product-46.png', 16, 1, 90.0000, 0, 9, '2016-09-09', 2.10000000, 1, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 0, 0, 1, '2015-02-03 21:08:29', '2020-08-16 21:09:38', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(47, 'Отпугиватель грызунов ГРАД А-500', 'ГРАД-А-500', '', '', '101', '100', '', '', 8, 5, 'catalog/products/repeller/mouse/grad-a-500/Grad-A-500_2.jpg', 9, 1, 3390.0000, 0, 12, '2015-10-09', 200.00000000, 2, 200.00000000, 30.00000000, 50.00000000, 2, 1, 1, 4, 1, 2409, '2015-02-03 21:08:40', '2022-10-12 20:40:22', 104, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(48, 'Collectible', 'test 1', '', '', '101', '', '', 'test 2', 995, 5, 'catalog/products/product-52.png', 18, 1, 240.0000, 0, 9, '2015-10-08', 1.60000000, 1, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 0, 0, 15, '2015-02-08 17:21:51', '2020-08-16 21:05:39', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(49, 'Deluxe', '', '', '', '101', '', '', '', 79998, 8, 'catalog/products/product-55.png', 19, 1, 230.0000, 0, 9, '2015-10-07', 40.00000000, 1, 0.00000000, 0.00000000, 0.00000000, 1, 1, 1, 1, 0, 0, '2015-04-26 08:57:34', '2020-08-16 21:08:25', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(50, 'Отпугиватель грызунов ГРАД А-550УЗ', 'ГРАД-А-550УЗ', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/mouse/grad-a-550uz/img0875-2.jpg', 9, 1, 3990.0000, 0, 12, '2009-02-03', 0.20000000, 1, 30.00000000, 20.00000000, 7.00000000, 1, 1, 1, 3, 1, 16572, '2015-09-10 15:46:02', '2022-09-20 19:24:48', 104, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(51, 'Отпугиватель грызунов ГРАД А-1000 ПРО', 'ГРАД-А-1000-ПРО', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/mouse/grad-a-1000-pro/GRAD_A-1000_PRO_14s.jpg', 9, 1, 7990.0000, 0, 12, '2009-02-03', 200.00000000, 2, 30.00000000, 20.00000000, 7.00000000, 1, 1, 1, 2, 1, 14478, '2015-09-11 11:04:54', '2022-09-20 19:25:44', 104, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(52, 'Отпугиватель грызунов ГРАД А-1000 ПРО+', 'ГРАД-А-1000-ПРО-PLUS', '', '', '101', '100', '', '', 1, 7, 'catalog/products/repeller/mouse/grad-a-1000-pro-plyus/sititek.ru_GRAD_A-1000_PRO_plus_1.jpg', 9, 1, 8690.0000, 0, 12, '2009-02-03', 330.00000000, 2, 22.00000000, 30.00000000, 10.00000000, 1, 1, 1, 2, 1, 5301, '2015-09-11 11:29:27', '2022-09-20 19:28:53', 104, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(56, 'Отпугиватель Собакам.Нет Вспышка+', 'ВСПЫШКАPLUS', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/dog/sobakam-net-vspyshka-plyus/sititek.ru_Sobak.Net_Vspyshka_plus_1.jpg', 9, 1, 5490.0000, 0, 12, '2015-09-10', 300.00000000, 2, 300.00000000, 30.00000000, 30.00000000, 2, 1, 1, 2, 1, 29771, '2015-09-11 21:57:27', '2022-01-22 09:09:42', 108, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(55, 'Адаптер питания от прикуривателя автомобиля отпугивателей ГРАД', 'GRAD-ADAPTER-12B-PRICURIVATEL', '', '', '101', '', '', '', 5, 7, 'catalog/products/repeller/mouse/adapter-pitaniya-prikurivatelya-grad/sititek.ru_adapter_ot_avtoprikurivatelya_grad_1.jpg', 9, 1, 690.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 1, 2948, '2015-09-11 20:03:52', '2021-11-12 15:32:47', 104, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(53, 'LR20 D1,5V', 'SAMSUNG-PLEOMAX-LR20', '', '', '101', '', '', '', 984, 7, 'catalog/products/1element/D/lr20-gp-super-alcaline-1.jpeg', 0, 1, 206.4000, 0, 12, '2015-09-10', 150.00000000, 2, 0.00000000, 150.00000000, 0.00000000, 2, 1, 1, 1, 1, 2590, '2015-09-11 15:36:38', '2022-09-13 16:17:44', 1101, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(54, 'Адаптер питания от аккумулятора (12 В) отпугивателей ГРАД', 'GRAD-ADAPTER-12B-AKB', '', '', '101', '', '', '', 4, 7, 'catalog/products/repeller/mouse/adapter-pitaniya-akkumul-12v-grad/sititek.ru_adapter_ot_akk_12v_grad_1.jpg', 9, 1, 690.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 98, 1, 3150, '2015-09-11 20:00:33', '2021-11-12 15:32:33', 104, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(57, 'Отпугиватель SITITEK ГРОМ-250М', 'ГРОМ-250М', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/dog/grom-250m/grom-250m2-02.jpg', 8, 1, 3990.0000, 0, 12, '2015-09-10', 300.00000000, 2, 20.00000000, 20.00000000, 5.00000000, 1, 1, 1, 3, 1, 13553, '2015-09-11 21:59:05', '2022-08-08 08:52:25', 108, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(58, 'Отпугиватель SITITEK ГРОМ-125', 'ГРОМ-125', '', '', '101', '100', '', '', 2, 5, 'catalog/products/repeller/dog/grom-125/sititek_grom-125_1.jpg', 8, 1, 2150.0000, 0, 12, '2015-09-10', 200.00000000, 2, 30.00000000, 5.00000000, 5.00000000, 1, 1, 1, 11, 1, 14017, '2015-09-11 22:01:12', '2021-01-27 09:40:51', 108, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(59, 'Отпугиватель Собакам.Нет', 'СОБАКАМ.НЕТ', '', '', '101', '100', '', '', 1, 7, 'catalog/products/repeller/dog/sobakam-net/sititek.ru_Sobak.Net_1.jpg', 9, 1, 3850.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 1, 9377, '2015-09-11 22:05:02', '2020-10-10 19:33:51', 108, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(60, 'Прибор от клещей Антиклещ М', 'АНТИКЛЕЩ-M', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/mite/antikleshh-m/antiklesch-m-2.jpg', 8, 1, 3500.0000, 0, 12, '2015-09-10', 300.00000000, 2, 300.00000000, 300.00000000, 20.00000000, 2, 1, 1, 1, 1, 2777, '2015-09-11 22:24:54', '2021-05-06 18:20:53', 110, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(70, 'Отпугиватель SITITEK ГРОМ 2X', 'SITITEK ГРОМ 2X', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/dog/sititek-grom-2x/sititek.ru_Sititek_GROM_2X_1.png', 8, 1, 2990.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1001, 0, 3519, '2015-09-12 13:27:33', '2018-07-28 19:39:07', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(69, 'RU0012 Умная розетка Senseit GS2 Slave', 'RU0012', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/gsm-rozetki/senseit-gs2-s/senseit_gs2_s_cart_360.png', 30, 1, 4950.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1006, 0, 2534, '2015-09-11 23:13:50', '2016-12-29 10:17:01', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(68, 'RU0011 Умная розетка Senseit GS2 Master', 'RU0011', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/gsm-rozetki/senseit-gs2-m/003.png', 30, 1, 7990.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1005, 0, 5577, '2015-09-11 23:12:07', '2016-12-29 10:10:57', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(67, 'Прибор от птиц  Bird Gard PRO', 'BIRD-GARD-PRO', '', '', '101', '100', '', '', 3, 5, 'catalog/products/repeller/bird/bioakustika/bird-gard-pro/bird-gard-pro-02.jpg', 54, 1, 45500.0000, 0, 12, '2015-09-10', 4.00000000, 1, 100.00000000, 4.00000000, 100.00000000, 2, 1, 1, 1, 1, 15726, '2015-09-11 23:04:08', '2022-06-17 10:26:32', 103, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(66, 'Электронный пропановый отпугиватель Е1', '', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/bird/grompushka/grompushka-e1/grompushka-e1_11.jpg', 49, 1, 27000.0000, 0, 12, '2015-09-10', 10.00000000, 1, 50.00000000, 10.00000000, 30.00000000, 1, 1, 1, 1001, 0, 5624, '2015-09-11 23:02:26', '2020-07-03 21:01:02', 103, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(65, 'Отпугиватель SITITEK ПЕГАС', 'SITITEK ПЕГАС', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/bird/uz/sititek-pegas/pegas-46_1.jpg', 8, 1, 6290.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2001, 0, 11208, '2015-09-11 23:00:14', '2021-11-12 16:30:41', 103, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(64, 'Установка-уничтожитель Комарам.нет KRN-5000 PRO', 'Комарам.нет KRN-5000 PRO', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/mosquito/killer/komaram-net-krn-5000-pro/Komaram.net_KRN-5000_PRO_1.jpg', 9, 1, 35990.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1000, 0, 3132, '2015-09-11 22:54:11', '2020-07-03 20:57:57', 109, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(63, 'Противомоскитный прибор ThermaCell MR G06-00', 'MR G06-00', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/mosquito/termacell/thermacell-2.jpg', 35, 1, 1725.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1001, 0, 6376, '2015-09-11 22:34:09', '2019-04-28 20:24:38', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(62, 'Ультразвуковой противомоскитный прибор Комарин-брелок Лайт', 'Комарин-брелок Лайт', '', '', '101', '', '', '', 1, 5, 'catalog/products/repeller/mosquito/uz/komarin-brelok-lajt/sititek.ru_Komarin-brelok_Lajt_1.jpg', 8, 1, 1290.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 50, 0, 3416, '2015-09-11 22:31:27', '2021-11-12 15:41:16', 105, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(61, 'Москито MV-01 Уничтожитель комаров, мошек', 'МОСКИТО-MV-01', '', '', '101', '100', '', '', 1, 5, 'catalog/products/repeller/mosquito/killer/moskito-mv-01/sititek.ru_Moskito_MV-01_1.jpg', 8, 1, 4990.0000, 0, 12, '2015-09-10', 4.00000000, 1, 40.00000000, 4.00000000, 50.00000000, 1, 1, 1, 1, 1, 8058, '2015-09-11 22:27:59', '2020-10-15 21:36:53', 109, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(78, 'Robo-sos LR-450 Робот-пылесос', 'LR-450', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/robot/sititek-robo-sos-lr-450/sititek.ru_robot_pylesos_robosos_lr_450_1.jpg', 8, 1, 15490.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 2128, '2015-09-12 13:58:51', '2020-09-29 20:59:01', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(79, 'Прибор от клещей MiteLess Home', 'MITELESS-HOME', '', '', '101', '', '', '', 6, 5, 'catalog/products/repeller/mite/miteless-home/sititek.ru_MiteLess-Home_1.jpg', 138, 1, 3280.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 1, 2239, '2015-09-12 20:05:36', '2021-05-06 18:19:50', 110, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(80, 'Robo-sos X500 Робот-пылесос SITITEK', 'ROBO-SOS-X-500', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/robot/sititek-robo-sos-x500/robo-sos-X500_1.jpg', 22, 1, 6490.0000, 0, 12, '2015-09-11', 3.00000000, 1, 34.00000000, 34.00000000, 9.00000000, 1, 1, 1, 2, 1, 2037, '2015-09-12 20:08:39', '2021-08-11 19:14:53', 210, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(81, 'Глазок с видеокамерой Black Fortress STK', 'SITITEK-BLACK-FORTRESS-STK', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/videoglazok/black-fortress-stk/black_fortress_stk_1-1.jpg', 0, 1, 11490.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 3283, '2015-09-12 20:28:52', '2021-11-12 16:26:12', 204, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(82, 'Глазок с видеокамерой SITITEK PentaLux', 'PentaLux', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/videoglazok/sititek-pentalux/sititek.ru_videoglazok_sititek_pentalux_1.jpg', 8, 1, 7990.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 1055, '2015-09-12 20:29:57', '2018-07-28 19:49:56', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(83, ' Домофон для дома SITITEK Grand Touch II', 'Grand Touch II', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/videodomofon/sititek-grand-touch-ii/sititek.ru_grand_touch_II_1.jpg', 8, 1, 10990.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 1720, '2015-09-12 20:38:57', '2020-10-08 20:47:35', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(84, 'Беспроводной видеодомофон KIVOS KDB 300', 'KIVOS-KDB-300', '', '', '101', '100', '', '', 0, 5, 'catalog/products/home/videodomofon/kivos/sititek.ru_KIVOS_1.jpg', 71, 1, 9900.0000, 0, 12, '2015-09-11', 5.00000000, 1, 0.00000000, 5.00000000, 0.00000000, 2, 1, 1, 1, 1, 4522, '2015-09-12 20:43:51', '2021-05-06 17:49:19', 204, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(85, 'Подставка для ноутбука SITITEK Bamboo 1', 'BAMBOO-1', '', '', '101', '100', '', '', 0, 5, 'catalog/products/home/stolik-dlya-noutbuka/sititek-bamboo-1/bamboo-1-24.jpg', 8, 1, 3790.0000, 0, 12, '2015-09-11', 5.00000000, 1, 50.00000000, 50.00000000, 20.00000000, 1, 1, 1, 1, 1, 6033, '2015-09-12 20:51:18', '2021-05-06 17:55:36', 209, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(86, 'Подставка для ноутбука  SITITEK Bamboo 2', 'BAMBOO-2', '', '', '101', '100', '', '', 0, 5, 'catalog/products/home/stolik-dlya-noutbuka/sititek-bamboo-2/bamboo-2-18.jpg', 8, 1, 3790.0000, 0, 12, '2015-09-11', 5.00000000, 1, 50.00000000, 50.00000000, 20.00000000, 1, 1, 1, 1, 1, 6557, '2015-09-12 20:51:51', '2021-05-06 17:55:46', 209, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(87, 'MT5060 Светодиодный светильник с датчиком движения Светум', 'MASTERKIT-MT5060', '', '', '101', '100', '', '', 0, 5, 'catalog/products/home/led-svetilnik/svetum/svetum-3.jpg', 12, 1, 950.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 1, 7767, '2015-09-12 21:04:38', '2020-10-09 20:27:45', 208, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(88, 'MT5091 Светодиодный светильник с датчиком движения Самосвет Мини', 'MASTERKIT-MT5091', '', '', '101', '100', '', '', 0, 8, 'catalog/products/home/led-svetilnik/samosvet-mini/KIT_MT_5091-1280x640.jpg', 12, 1, 1200.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 102, 1, 3880, '2015-09-12 21:05:56', '2020-10-09 20:38:30', 208, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(89, 'FB0020 Камера наблюдения iCam HD 360', 'FB0020', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/videonblyudenie/icam-hd-360/71ISt-jo79L._SX355.jpg', 0, 1, 14900.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 3, 0, 997, '2015-09-12 21:11:16', '2016-06-14 13:08:55', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(90, 'Камера наблюдения IP Zmodo SH721', 'IP Zmodo SH721', '', '', '101', '', '', '', 1000, 5, 'catalog/products/home/videonblyudenie/kamera-ip-zmodo-sh721/sititek.ru_Zmodo_SH721_1.jpg', 0, 1, 7200.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 1825, '2015-09-12 21:11:41', '2020-08-17 18:35:11', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(91, 'Видеокомплект Wi-Fi Zmodo Беспроводной', '', '', '', '101', '', '', '', 1000, 5, 'catalog/products/home/videonblyudenie/videokomplekt-wi-fi-zmodo-besprovodnoj/sititek.ru_wi_fi_zmodo_besprovodnoj_1.jpg', 0, 1, 43500.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 3, 0, 546, '2015-09-12 21:19:48', '2016-12-02 17:20:57', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(92, 'Прибор измерения нитратов и уровня радиации SOEKS Экотестер 2', '', '', '', '101', '', '', '', 0, 5, 'catalog/products/health/ehkonabor/econabor-soeks-3.jpg', 11, 1, 5900.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 10836, '2015-09-12 21:27:24', '2019-12-28 15:23:06', 207, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(93, 'СОЭКС Нитрат-тестер 2', 'СОЭКС нитратомер', '', '', '101', '', '', '', 0, 5, 'catalog/products/health/nitratomer-soehks-2/soeks-nitrattester-2-3.jpg', 11, 1, 4200.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 2788, '2015-09-12 21:29:23', '2018-07-15 14:48:19', 207, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(94, 'СОЭКС эконабор: Экотестер + Импульс', 'СОЭКС эконабор', '', '', '101', '', '', '', 0, 5, 'catalog/products/health/ehkonabor/econabor-soeks-1.jpg', 11, 1, 7700.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 4184, '2015-09-12 21:38:43', '2019-11-03 21:17:17', 207, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(95, 'MT2033 Брелок Гейгера', 'MT2033', '', '', '101', '', '', '', 1000, 5, 'catalog/products/health/brelok-gejgera/schetchik-gejgera-2.png', 12, 1, 7900.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 764, '2015-09-12 22:00:50', '2018-09-15 18:19:03', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(96, 'Профессиональный алкометр AlcoHunter Professional+', 'ALCOHUNTER-PROFESSIONAL-PLUS', '', '', '101', '100', '', '', 13, 5, 'catalog/products/car/alkotester/alcohunter-professional-plyus/spirta.net_raz_01_22.jpg', 9, 1, 12990.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 1, 5318, '2015-09-12 22:09:34', '2023-02-15 09:50:59', 301, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(97, 'Портативный автомобильный jump starter E-Power Elite', 'E-Power Elite', '', '', '101', '', '', '', 0, 5, 'catalog/products/car/pusko-zaryadnoe-ustrojstvo/carku-e-power-elite/carku-e-power-elite-21.jpg', 32, 1, 5790.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 5176, '2015-09-12 22:12:19', '2020-04-23 17:27:10', 302, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(98, 'Портативный автомобильный jump starter E-Power 21', '', '', '', '101', '', '', '', 0, 8, 'catalog/products/car/pusko-zaryadnye-ustrojstva/carku-e-power-21/carku-e-power-21-1.jpg', 32, 1, 9820.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1002, 0, 2793, '2015-09-12 22:16:42', '2020-09-03 22:33:31', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(968, 'CARKU PRO-10', 'CARKU-PRO-10', '', '', '101', '100', '', '', 0, 5, 'catalog/products/car/pusko-zaryadnye-ustrojstva/carku-pro-10/carku_pro-10-02.jpg', 32, 1, 8990.0000, 0, 12, '2020-09-03', 1.00000000, 1, 140.00000000, 76.00000000, 25.00000000, 2, 1, 1, 109, 1, 1696, '2020-09-03 21:55:10', '2022-09-08 15:04:39', 302, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(969, 'CARKU PRO-30', 'CARKU-PRO-30', '', '', '101', '100', '', '', 0, 5, 'catalog/products/car/pusko-zaryadnye-ustrojstva/carku-pro-30/carku_pro-30-02.jpg', 32, 1, 11190.0000, 0, 12, '2020-09-03', 1.10000000, 1, 140.00000000, 76.00000000, 25.00000000, 2, 1, 1, 110, 1, 2135, '2020-09-03 21:59:51', '2022-09-08 15:04:56', 302, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(970, 'CARKU PRO-60', 'CARKU-PRO-60', '', '', '101', '100', '', '', 0, 5, 'catalog/products/car/pusko-zaryadnye-ustrojstva/carku-pro-60/carku_pro-60-02.jpg', 32, 1, 13990.0000, 0, 12, '2020-09-03', 1.60000000, 1, 255.00000000, 125.00000000, 105.00000000, 2, 1, 1, 111, 1, 1295, '2020-09-03 22:03:54', '2022-09-08 15:05:27', 302, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(101, 'RU0024 АвтоФон D-Маяк Мото', 'RU0024', '', '', '101', '', '', '', 0, 5, 'catalog/products/car/avtofon/avtofon-d-mayak-moto/1380803254_mayak1.png', 0, 1, 6900.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 1146, '2015-09-12 22:51:48', '2018-03-28 21:38:41', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(102, 'RU0025 АвтоФон SE-Маяк', 'RU0025', '', '', '101', '', '', '', 0, 5, 'catalog/products/car/avtofon/avtofon-se-mayak/1380803012_vayak_s-kishkamy.png', 0, 1, 4900.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 968, '2015-09-12 22:55:55', '2016-07-28 15:57:14', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(103, 'MT2014 Антисон', 'MT2014', '', '', '101', '', '', '', 0, 5, 'catalog/products/car/antison/antison-200x200-1.png', 0, 1, 1700.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 1573, '2015-09-12 23:07:44', '2018-07-28 19:41:28', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(104, 'Источник питания с солнечной панелью Sun Battery Case', 'Sun Battery Case', '', '', '101', '', '', '', 0, 5, 'catalog/products/travel/zaryadnye-ustrojstva-solnechnykh-batareyakh/sun-battery-case/sun_battery_case_1-1.png', 0, 1, 12500.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 544, '2015-09-12 23:22:01', '2016-06-14 13:14:22', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(105, 'SITITEK Sun-Battery SC-09', 'SUN-BATTERY-SC-09', '', '', '101', '100', '', '', 0, 5, 'catalog/products/travel/zaryadnye-ustrojstva-solnechnykh-batareyakh/sititek-sun-battery-sc-09/sititek.ru_Sun-Battery_SC-09_2.jpg', 8, 1, 1590.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 1, 5541, '2015-09-12 23:24:09', '2021-03-12 20:35:00', 302, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(106, 'FB0030 GPS трекер BUSHNELL', 'FB0030', '', '', '101', '', '', '', 0, 5, 'catalog/products/travel/vozvrashhatel/bushnell/vozvraschatel-bushnell-2.jpg', 14, 1, 9900.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 4589, '2015-09-13 10:32:55', '2018-07-18 13:00:26', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(107, 'FB0025 Сетевой разветвитель с USB Power Cube Travel', 'FB0025', '', '', '101', '', '', '', 0, 5, 'catalog/products/travel/power-cube-travel/3028.jpg', 0, 1, 2850.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 101, 0, 1779, '2015-09-13 10:46:30', '2021-05-19 19:26:50', 1103, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(108, 'MT1099 Ультралегкий Power–bank 8Gb', 'MT1099', '', '', '101', '', '', '', 1000, 5, 'catalog/products/travel/power-bank/power–fleshka/mt1099useplaces5-3.png', 0, 1, 1790.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 0, 99, 0, 323, '2015-09-13 10:55:20', '2016-06-14 12:55:05', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(109, 'FB0021 3D ручка 3Dali Plus', 'FB0021', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/3d-pen/3d-ruchka-3dali-plyus/1_ufMy55w.png', 0, 1, 5950.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 774, '2015-09-13 11:35:59', '2016-06-14 12:53:27', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(110, 'FB0009 3D ручка 3Dali', 'FB0009', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/3d-pen/3d-ruchka-3dali/4_j0Ndi24.png', 0, 1, 4950.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 561, '2015-09-13 11:37:42', '2021-03-22 10:18:09', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(111, 'RU0077 3D палитра', 'RU0077', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/3d-pen/3d-palitra/1dsc_0076+.jpg', 19, 1, 1590.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 22, 0, 1476, '2015-09-13 11:43:41', '2018-07-18 13:01:48', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(112, 'Набор мотков ABS', '', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/3d-pen/cvetnoj-abs-9-cvetov/cvetnoj_ABS_9_cvetov_1.jpg', 8, 1, 900.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 14, 0, 1042, '2015-09-13 11:50:25', '2018-07-18 13:14:51', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(113, 'FB0018 Радиоконструктор Знаток 999', 'FB0018', '', '', '101', '', '', '', 2, 5, 'catalog/products/child/constructor/znatok-999-skhem-plyus-shkola/znatok-999-shem-shkola-1.jpg', 0, 1, 3790.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 3065, '2015-09-13 12:03:23', '2020-10-13 20:05:09', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(114, 'FB0017 Радиоконструктор Знаток Первые шаги', 'FB0017', '', '', '101', '', '', '', 2, 5, 'catalog/products/child/constructor/znatok-pervye-shagi/fb0017-02.jpg', 0, 1, 1590.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 857, '2015-09-13 12:03:52', '2020-10-13 20:05:17', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(115, 'EK-505', 'EK-505', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/constructor/robot-konstruktor-khvatokhod/3-850x850.jpg', 17, 1, 3950.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 4452, '2015-09-13 12:16:01', '2018-12-17 10:48:17', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(116, 'EK-504', 'EK-504', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/constructor/robot-konstruktor-robomaster/full_ek-504.jpg', 17, 1, 3950.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 5, 0, 1400, '2015-09-13 12:18:31', '2018-07-28 20:33:31', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(117, 'Проектор звездного неба HomeStar Classic', 'HOMESTAR-CLASSIC', '', '', '101', '100', '', '', 0, 5, 'catalog/products/child/domashnij-planetarij/planetarij-homestar-classic/HomeStar-Classic_3.jpg', 13, 1, 14890.0000, 0, 12, '2015-09-12', 1.00000000, 1, 30.00000000, 1.00000000, 30.00000000, 1, 1, 1, 1, 1, 8571, '2015-09-13 12:50:22', '2021-05-11 19:09:08', 502, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(118, 'Проектор звездного неба HomeStar Earth Theater', '', '', '', '101', '', '', '', 1000, 5, 'catalog/products/child/domashnij-planetarij/planetarij-homestar-earth-theater/color/sititek.ru_HomeStar-earth-theater-belyjj_1.jpg', 13, 1, 39990.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 1964, '2015-09-13 12:50:52', '2019-07-14 10:18:17', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(119, 'Проектор звездного неба HomeStar Lite STK', '', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/domashnij-planetarij/planetarij-homestar-lite-stk/sititek.ru_Homestar_Lite_belyj_1.jpg', 13, 1, 5990.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 3, 0, 3454, '2015-09-13 12:53:34', '2020-04-01 20:06:42', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(120, 'Проектор звездного неба HomeStar Aroma', '', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/domashnij-planetarij/planetarij-homestar-aroma/color/sititek.ru_HomeStar-Aroma_belyjj_1.jpg', 13, 1, 4990.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 1641, '2015-09-13 13:06:42', '2019-07-14 10:18:25', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(121, 'Цифровой микроскоп СИИТЕК Микрон LCD', 'СИТИТЕК Микрон LCD', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/usb-microscope/mikroskop-usb-sititek-mikron-lcd/sititek.ru_microskop_tsifrovoy_USB_DigiMicro_LCD_5_Mpix_1.jpg', 8, 1, 12390.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 101, 0, 3504, '2015-09-13 13:35:20', '2020-10-19 21:53:59', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(122, 'Цифровой микроскоп SITITEK Микрон-400', '', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/usb-microscope/mikroskop-usb-sititek-mikron-400/sititek.ru_Mikron-400_1.jpg', 8, 1, 5390.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 972, '2015-09-13 13:35:40', '2018-07-28 19:43:18', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(123, 'Цифровой микроскоп SITITEK Микрон Mobile', 'SITITEK Микрон Mobile', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/usb-microscope/mikroskop-usb-sititek-mikron-mobile/sititek.ru_microskop_tsifrovoy_USB_DigiMicro_Mobile_5_Mpix_7.jpg', 8, 1, 10990.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 3570, '2015-09-13 13:38:08', '2020-10-19 21:54:39', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(124, 'Родительский и детские блоки SITITEK 3,2', 'SITITEK 3,2', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/videonyanya/videonyanya-sititek-3-2/sititek.ru_sititek_32_1.jpg', 8, 1, 7900.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 537, '2015-09-13 13:45:58', '2016-08-08 15:43:36', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(125, 'MT6026 Автономные колонки с режимом hands-free MobiSound', 'MT6026', '', '', '101', '', '', '', 0, 5, 'catalog/products/music/mobisound/mobisound-1.jpg', 12, 1, 2950.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1001, 0, 3615, '2015-09-13 16:42:23', '2020-04-01 19:31:45', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(126, 'FB0035 Harper Bluetooth наушники с микрофоном (вкладыши)', 'FB0035', '', '', '101', '', '', '', 0, 5, 'catalog/products/music/besprovodnye-naushniki-s-mikrofonom-vkladyshi/FB00343.jpg', 0, 1, 3350.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 3, 0, 258, '2015-09-13 16:44:26', '2016-06-14 13:02:22', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(127, 'Автоматическая кормушка SITITEK Pets Mini', 'SITITEK-PETS-MINI', '', '', '101', '', '', '', 0, 5, 'catalog/products/pet/avtokormushki/sititek-pets-mini/sititek.ru_SITITEK-Pets-Mini_goluboi_1.jpg', 8, 1, 3200.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 1, 4276, '2015-09-13 19:18:42', '2021-05-06 18:01:28', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(128, 'Автоматическая кормушка SITITEK Pets Maxi', 'SITITEK-PETS-MAXI', '', '', '101', '', '', '', 39, 5, 'catalog/products/pet/avtokormushki/sititek-pets-maxi/sititek.ru_SITITEK-Pets-Maxi_goluboi_1.jpg', 8, 1, 3300.0000, 0, 12, '2015-09-12', 2.00000000, 1, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 1, 4457, '2015-09-13 19:19:38', '2021-05-06 18:01:05', 903, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(129, 'Автоматическая кормушка SITITEK Pets Tower-5', 'SITITEK Pets Tower-5', '', '', '101', '', '', '', 0, 5, 'catalog/products/pet/avtokormushki/sititek-pets-tower-5/sititek.ru_SITITEK-Pets-Tower-5_1.jpg', 8, 1, 4900.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1002, 0, 2076, '2015-09-13 19:31:45', '2020-10-19 21:56:19', 903, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(130, 'Автоматическая кормушка SITITEK Pets Tower-10', 'SITITEK Pets Tower-10', '', '', '101', '', '', '', 0, 5, 'catalog/products/pet/avtokormushki/sititek-pets-tower-10/sititek.ru_SITITEK-Pets-Tower-10_1.jpg', 8, 1, 4500.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1001, 0, 2403, '2015-09-13 19:34:41', '2020-10-19 21:56:36', 903, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(131, 'Автоматическая поилка SITITEK Pets Aqua 2', 'SITITEK Pets Aqua 2', '', '', '101', '', '', '', 0, 5, 'catalog/products/pet/avtokormushki/avtopoilka-sititek-pets-aqua-2/sititek.ru_SITITEK-Pets-Aqua-2_1.jpg', 8, 1, 2100.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 3288, '2015-09-13 19:43:00', '2020-10-19 21:26:52', 903, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(132, 'Антижучок &quot;BugHunter Профессионал&quot; BH-01', 'BugHunter BH-01', '', '', '101', '', '', '', 0, 5, 'catalog/products/security/antibug/bughunter-professional-bh-01/raz_01_01.jpg', 9, 1, 6990.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 3683, '2015-09-13 19:49:24', '2020-01-13 17:10:30', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(133, 'Антижучок &quot;BugHunter Профессионал&quot; BH-03', 'BUGHUNTER-BH-03', '', '', '101', '100', '', '', 6, 5, 'catalog/products/security/antibug/bughunter-professional-bh-03/bh-03_1.jpg', 9, 1, 25250.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 1, 9634, '2015-09-13 19:49:48', '2021-05-06 17:26:38', 601, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(134, 'Глушитель прослушки BugHunter DAudio bda-2 Voices', 'BugHunter DAudio bda-2 Voices', '', '', '101', '', '', '', 3, 5, 'catalog/products/security/antiproslushka/bughunter-daudio-bda-2-voices/BugHunter_DAudio_bda-2_Voices_6.jpg', 9, 1, 30000.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 4259, '2015-09-13 19:52:50', '2020-02-19 15:44:56', 603, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(135, 'Обнаружитель скрытых камер BugHunter Dvideo', 'BUGHUNTER-DVIDEO', '', '', '101', '100', '', '', 3, 5, 'catalog/products/security/antivideo/bughunter-dvideo/baghunter-dvideo-22.jpg', 9, 1, 10530.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 1, 4890, '2015-09-13 19:58:18', '2021-05-06 17:27:51', 602, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(136, 'Портативный глушитель СТРАЖ Мини 3G', 'СТРАЖ Мини 3G', '', '', '101', '', '', '', 0, 5, 'catalog/products/security/antiphone/strazh-mini-3g/sititek.ru_GSM_i_3G_1.jpg', 31, 1, 13990.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 1025, '2015-09-13 20:00:18', '2017-06-25 10:52:23', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(137, 'Глушитель CDMA , GSM, 3G, 4G LTE WIMAX, GPS, Wi-Fi СТРАЖ X8 ПРО', 'СТРАЖ X8 ПРО', '', '', '101', '', '', '', 0, 5, 'catalog/products/security/antiphone/strazh-x8-pro/sititek.ru_BlackHunter_X8_PRO_1.jpg', 31, 1, 38250.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 1137, '2015-09-13 20:00:36', '2018-12-15 16:01:32', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(138, 'Мундштук универсальный круглый', 'ALCOHUNTER-MUNDSHTUK', '', '', '101', '', '', '', 398, 5, 'catalog/products/car/alkotester/mundshtuk-universalnyj-kruglyj/sititek.ru_mundshtuk-universal-nyj-kruglyj_1s.jpg', 8, 1, 25.0000, 0, 12, '2015-09-15', 10.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 50, 1001, 1, 2344, '2015-09-16 22:26:13', '2021-05-06 17:33:52', 301, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(139, 'Проектор звездного неба СИТИТЕК AstroEye', 'SITITEK-ASTROEYE', '', '', '101', '100', '', '', 1, 5, 'catalog/products/child/domashnij-planetarij/planetarij-sititek-astroeye/sititek.ru_sititek_astroeye_1.jpg', 8, 1, 5390.0000, 0, 12, '2015-09-12', 1.00000000, 1, 30.00000000, 1.00000000, 30.00000000, 1, 1, 1, 1001, 1, 4821, '2015-09-19 15:48:02', '2023-01-16 18:12:19', 502, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(140, 'FB0034 Harper Bluetooth наушники с микрофоном', 'HB-401', '', '', '101', '', '', '', 0, 5, 'catalog/products/music/besprovodnye-naushniki-s-mikrofonom/full_FB00341-2.jpg', 15, 1, 2950.0000, 0, 12, '2015-09-18', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 275, '2015-09-19 18:43:08', '2017-02-13 19:15:09', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(141, 'MT3020 Усилитель сигнала GSM', 'MT3020', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/usiliteli-signala-gsm/stacionarnyj-sotovyj-telefon/add/9f30bf7b50777105d28fa8f71c01333b.jpg', 0, 1, 3990.0000, 0, 12, '2015-09-23', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 1575, '2015-09-24 16:56:34', '2019-06-21 08:15:27', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(143, 'Термокружка-непроливайка Контиго Байрон', 'contigo0329', '', '', '101', '', '', '', 0, 5, 'catalog/products/daily/termokruzhki/termokruzhka-contigo-byron-0.47-litra-metallicheskaya/termosinis-puodelis-contigo-byron.jpg', 53, 1, 1850.0000, 0, 12, '2015-09-25', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 2563, '2015-09-26 19:04:22', '2019-01-26 18:14:09', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(145, 'Стационарный отпугиватель животных Weitech WK0051', 'Weitech WK0051', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/dog/weitech-wk0051/Weitech_WK0051_1.jpg', 10, 1, 3790.0000, 0, 12, '2015-09-26', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1001, 0, 7886, '2015-09-27 17:51:54', '2022-09-13 16:17:11', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(146, 'Стационарный отпугиватель животных Weitech WK0053', 'WEITECH-WK-0053', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/dog/weitech-wk0053/weitech-WK0053-11.jpg', 10, 1, 7820.0000, 0, 12, '2015-09-26', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 23, 1, 6643, '2015-09-27 18:36:37', '2021-04-14 08:41:45', 108, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(147, 'Отпугиватель ЭкоСнайпер LS-937CD', 'LS-937CD', '', '', '101', '100', '', '', 2, 5, 'catalog/products/repeller/dog/LS-937CD/ls-937CD.jpg', 5, 1, 4816.0000, 0, 12, '2015-09-30', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 24, 1, 7130, '2015-10-01 16:41:20', '2021-04-17 21:54:26', 108, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(148, 'Бюджетный алкометр &quot;AlcoHunter Эконом&quot;', 'ALCOHUNTER-ECONOM', '', '', '101', '100', '', '', 25, 5, 'catalog/products/car/alkotester/alkotester-alcohunter-ehkonom/alcohunter_jekonom_1.jpg', 9, 1, 7990.0000, 0, 12, '2015-09-11', 1.00000000, 1, 30.00000000, 20.00000000, 10.00000000, 1, 1, 1, 1, 1, 3890, '2015-10-06 20:13:30', '2021-07-08 22:19:21', 301, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(149, 'RU0023 АвтоФон D-Маяк', 'RU0023', '', '', '101', '', '', '', 0, 5, 'catalog/products/car/avtofon/avtofon-d-mayak/IMG_0035.jpg', 0, 1, 8750.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 1698, '2015-10-06 22:13:51', '2018-03-28 21:38:33', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(150, 'ЭкоСнайпер LS-927M', 'LS-927M', '', '', '101', '100', '', '', 4, 7, 'catalog/products/repeller/mouse/LS-927M/_MG_5009.jpg', 5, 1, 4816.0000, 0, 12, '2009-02-03', 1.00000000, 1, 0.00000000, 1.00000000, 0.00000000, 1, 1, 1, 11, 1, 8744, '2015-10-07 10:59:37', '2021-07-14 09:40:03', 104, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(151, 'Умная розетка Sapsan PRO-10', 'SAPSAN-GSM-SOCKET-PRO-10 ', '', '', '101', '100', '', '', 0, 5, 'catalog/products/home/gsm-rozetki/gsm-rozetka-sapsan-pro-10/1359.970.jpg', 16, 1, 3910.0000, 0, 12, '2009-02-03', 380.00000000, 2, 0.00000000, 380.00000000, 0.00000000, 2, 1, 1, 5, 0, 21020, '2015-10-07 15:21:15', '2022-09-05 16:21:38', 201, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(152, 'Цифровой микроскоп 3 в 1 SITITEK Микрон Space', 'SITITEK Микрон Space', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/usb-microscope/mikroskop-cifrovoj-3-v-1-usb-sititek-mikron-space-1-3-mpix-400-x-zoom/SITITEK_Mikron_Space_new_f_1.jpg', 8, 1, 5990.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 5068, '2015-10-10 20:40:13', '2020-10-19 21:54:20', 501, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(153, 'Антижучок BugHunter™ Mini  MN-01', 'BugHunter Mini', '', '', '101', '', '', '', 0, 5, 'catalog/products/security/antibug/bughunter-mini/raz_01_02.jpg', 9, 1, 3990.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 3361, '2015-10-11 18:24:50', '2020-01-13 18:45:01', 601, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(154, 'Обнаружитель скрытых камер BugHunter Dvideo Эконом', 'BUGHUNTER-DVIDEO-ECONOM', '', '', '101', '100', '', '', 1, 5, 'catalog/products/security/antivideo/bughunter-dvideo-econom/bughunter-dvideo-ekonom-02.jpg', 9, 1, 5430.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 1, 3493, '2015-10-11 21:28:06', '2021-05-06 17:27:34', 602, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(155, 'RU0058 Беспроводной GSM фото сигнализатор', 'RU0058', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/provodnye-gsm-signalizacii/foto-signalizaciya/photoexpress-1-0.png', 27, 1, 9990.0000, 0, 12, '2015-10-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 1061, '2015-10-12 21:17:06', '2018-07-28 19:40:14', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(156, 'RU0068 Свето-звуковой оповещатель Фото-сигнализации Призма-С', 'RU0068', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/provodnye-gsm-signalizacii/foto-signalizaciya/datchiki/prizma_c.jpg', 27, 1, 1850.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 661, '2015-10-13 18:37:16', '2016-06-14 13:14:08', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(157, 'GSM cигнализация Сапсан GSM Pro 4', '2601', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/sapsan-gsm-pro-4/sapsan-gsm-pro-4-1.jpg', 16, 1, 7790.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 6, 0, 10329, '2015-10-13 19:06:59', '2020-08-17 21:28:48', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(158, '3097 Sapsan SR-02 Свето-звуковой оповещатель', 'SR-02', '', '', '101', '100', '', '', 0, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/besprovodnye-datchiki/sirenarevun-k-sapsan-gsm/sveto-zvukovaya-sirena-sapsan-sr-02.jpg', 16, 1, 1848.0000, 0, 12, '2015-10-12', 1.00000000, 1, 0.00000000, 1.00000000, 0.00000000, 2, 1, 1, 51, 1, 3059, '2015-10-13 19:51:23', '2021-06-10 09:23:30', 203, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(159, '2281 Беспроводной ИК извещатель объема', '2281', '', '', '101', '', '', '', 87, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/besprovodnye-datchiki/datchik_dvizeniay_100/datchik_dvizeniay_100.jpg', 16, 1, 779.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 41, 1, 3401, '2015-10-13 20:10:21', '2020-03-20 11:38:42', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(160, '2627 Беспроводной ИК извещатель объема с защитой от кошек собак', '2627', '', '', '101', '', '', '', 99, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/besprovodnye-datchiki/datchik_zhahitii_ot_zhivitniich/datchik_zhahitii_ot_zhivitniich.jpg', 0, 1, 1449.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 40, 1, 2072, '2015-10-13 20:26:49', '2020-03-20 11:39:03', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(161, '2287 Беспроводная сирена к Sapsan GSM SR-03', '2287', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/besprovodnye-datchiki/sirenarevun-k-sapsan-gsm/besprovodnaya-sirenarevun-k-sapsan-gsm-sr-03.jpg', 0, 1, 3500.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 52, 0, 2507, '2015-10-13 20:53:53', '2020-03-20 11:47:08', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(162, '3370 Беспроводной извещатель протечки воды', '3370', '', '', '101', '', '', '', 99, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/besprovodnye-datchiki/datchik_protechki_vodii/datchik_protechki_vodii.jpg', 0, 1, 885.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 54, 1, 1942, '2015-10-13 21:05:17', '2020-03-20 12:05:40', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(163, '2284 Беспроводной дымовой извещатель к сигнализации Sapsan', '2284', '', '', '101', '', '', '', 8, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/besprovodnye-datchiki/datchik_pozharniiy/datchik_pozharniiy-1.jpg', 16, 1, 889.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 61, 1, 2317, '2015-10-13 21:22:09', '2018-02-07 16:35:58', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(164, '3699 GSM Сигнализация Sapsan GSM Pro 5T', 'Sapsan GSM Pro 5T', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/sapsan-gsm-pro-5t/sapsan-gsm-pro-5t-1.jpg', 16, 1, 9184.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 3, 1, 4813, '2015-10-13 21:49:16', '2021-06-10 09:19:14', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(165, 'GSM Сигнализация Sapsan GSM Pro 6 &quot;Умный Дом&quot;', 'Sapsan GSM Pro 6', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/sapsan-gsm-pro-6/sapsan-gsm-pro-6.jpg', 16, 1, 13429.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 1, 5736, '2015-10-14 11:31:28', '2021-06-10 09:19:25', 202, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(166, 'Кситал GSM 4 проводная сигнализация', 'Кситал GSM 4', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/provodnye-gsm-signalizacii/ksital-gsm-4/ksital-gsm-4.jpg', 137, 1, 7910.0000, 0, 12, '2015-10-13', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 1, 3798, '2015-10-14 17:39:19', '2021-06-10 09:25:25', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(167, '7321 Розетка управления электроприборами (3 гнезда/1 реле)', '7321', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/provodnye-gsm-signalizacii/upravlyaemaya-trechgnezdovai-rozetka-4-kvatt/upravlyaemaya-trechgnezdovai-rozetka-4-kvatt.jpg', 0, 1, 2990.0000, 0, 12, '2015-10-13', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 3580, '2015-10-14 18:06:18', '2020-10-15 20:37:51', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(168, '2205 КСИТАЛ-ТД цифровой выносной датчик температуры', '2205', '', '', '101', '', '', '', 0, 8, 'catalog/products/home/signalizacii/provodnye-gsm-signalizacii/termodatchik-ksital-td/termodatchik-ksital-td.gif', 137, 1, 890.0000, 0, 12, '2015-10-13', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 98, 1, 3584, '2015-10-14 18:25:39', '2020-10-14 20:54:17', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(169, 'Глазок с видеокамерой TANTOS Tsc-190HDV', 'TANTOS Tsc-190HDV', '', '', '101', '', '', '', 0, 7, 'catalog/products/home/videoglazok/tsc-190hdv/videoglazok-tantos-tsc-190dv.jpg', 18, 1, 7430.0000, 0, 12, '2009-02-03', 0.00000000, 2, 140.00000000, 0.00000000, 16.00000000, 2, 1, 1, 98, 0, 698, '2015-10-14 19:31:48', '2018-07-28 19:50:29', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(170, 'Глазок с видеокамерой FE-VE02', 'FE-VE02', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/videoglazok/avtonomnyj-videoglazok-fe-ve02/avtonomnyj-videoglazok-fe-ve02-b.jpg', 0, 1, 8000.0000, 0, 12, '2015-10-15', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 471, '2015-10-16 09:29:20', '2018-07-28 19:55:12', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(171, 'MT5050 Светобудильник Рассвет', 'MT5050', '', '', '101', '', '', '', 0, 5, 'catalog/products/health/svetobudilnik/rassvet/rassvet-1.png', 19, 1, 4950.0000, 0, 12, '2015-10-15', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 1612, '2015-10-16 11:06:16', '2018-07-28 19:47:32', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(172, 'FB0014 Светобудильник Medisana', 'FB0014', '', '', '101', '', '', '', 0, 5, 'catalog/products/health/svetobudilnik/medisana/medisana.jpg', 21, 1, 7900.0000, 0, 12, '2015-10-15', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 1582, '2015-10-17 00:13:57', '2018-07-28 19:47:20', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(173, 'CW8728 Светобудильник', 'CW8728', '', '', '101', '', '', '', 100, 5, 'catalog/products/health/svetobudilnik/CW8728/cw8728_485x800.jpg', 22, 1, 2550.0000, 0, 12, '2015-10-15', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 2442, '2015-10-17 21:09:43', '2019-11-03 21:27:25', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(174, 'PLEOMAX SAMSUNG LR6 4S', 'SAMSUNG-PLEOMAX-AA', '', '', '101', '', '', '', 1000, 7, 'catalog/products/1element/AA/pleomax-aa-1.jpg', 0, 1, 55.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 1, 437, '2015-10-18 11:57:09', '2022-09-13 16:12:57', 1101, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(175, 'KODAK MAX LR03-2BL', 'KODAK-PLEOMAX-AAA', '', '', '101', '', '', '', 1000, 7, 'catalog/products/1element/AAA/kodak-max-lr03-2bl/MAX LR03-10BL-500x500.jpg', 0, 1, 55.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 1, 937, '2015-10-18 12:00:02', '2022-09-13 16:13:38', 1101, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(176, 'Карта памяти 32Гб microSDHC (SDC10/32GBSP) с адаптером', 'SDC10/32GBSP', '', '', '101', '', '', '', 199, 5, 'catalog/products/1cdcard/karta-pamyati-32gb-microsdhc-sdc10-32gbsp-2.jpg', 22, 1, 1152.0000, 0, 12, '2015-10-17', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1002, 1, 1331, '2015-10-18 12:28:02', '2020-08-17 19:07:39', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(177, 'Карта памяти 32 Гб microSDHC (SDC10/32GBSP) без адаптера', 'SDC10/32GBSP', '', '', '101', '', '', '', 199, 5, 'catalog/products/1cdcard/karta-pamyati-32gb-microsdhc-sdc10-32gbsp-1.jpg', 0, 1, 1024.0000, 0, 12, '2015-10-17', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1001, 0, 589, '2015-10-18 12:32:17', '2021-05-06 21:37:12', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(178, 'MT1096 Зарядное устройство Крошка-USB 2.0', 'MT1096', '', '', '101', '', '', '', 0, 5, 'catalog/products/car/adapter-kroshka-usb-2-0/mt1096_1.png', 12, 1, 350.0000, 0, 12, '2015-10-17', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 496, '2015-10-18 14:37:18', '2016-05-21 08:35:15', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(179, '7193 Система наблюдения с видеокамерами Лидер', '7193', '', '', '101', '', '', '', 1, 5, 'catalog/products/home/videonblyudenie/sapsan/komplekt-videonablyudeniya-sapsan-lider/komplekt-videonablyudeniya-sapsan-lider.jpg', 16, 1, 31990.0000, 0, 12, '2015-10-17', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 2335, '2015-10-18 21:31:10', '2020-08-17 19:15:31', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(180, 'Отпугиватель ЭкоСнайпер LS-977F', 'LS-977F', '', '', '101', '100', '', '', 0, 7, 'catalog/products/repeller/dog/LS-977F/LS-977F.jpg', 5, 1, 2580.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 91, 1, 9386, '2015-10-19 20:22:58', '2021-07-07 12:17:39', 108, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(181, 'Шипы от птиц Барьер', 'Барьер', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/bird/shipy_antiprisadnye_barer/Barier_1.jpg', 0, 1, 120.0000, 0, 12, '2015-10-19', 100.00000000, 2, 0.00000000, 100.00000000, 0.00000000, 2, 1, 10, 1001, 0, 3886, '2015-10-20 08:41:53', '2020-08-18 13:02:04', 103, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(182, 'VARTA LONGLIFE 4122 6LR61', 'VARTA-9V-KRONA', '', '', '101', '', '', '', 2, 7, 'catalog/products/1element/Krona/varta-longlife-4122-6lr61/6LR61-9V-VARTA-LONGLIFE-Luz.jpg', 0, 1, 283.8000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 6, 1, 1282, '2015-10-20 11:02:45', '2022-09-13 16:14:21', 1101, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(183, 'ЭкоСнайпер LS-968', 'LS-968', '', '', '101', '100', '', '', 2, 7, 'catalog/products/repeller/mouse/LS-968/LS-968-3.jpg', 5, 1, 3182.0000, 0, 12, '2009-02-03', 1.00000000, 1, 0.00000000, 1.00000000, 0.00000000, 1, 1, 1, 12, 1, 6231, '2015-10-20 11:14:20', '2020-10-10 16:32:44', 104, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(184, 'ЭкоСнайпер LS-989', 'LS-989', '', '', '101', '100', '', '', 0, 7, 'catalog/products/repeller/mouse/LS-989/LS-989-2.jpg', 5, 1, 3010.0000, 0, 12, '2009-02-03', 1.00000000, 1, 0.00000000, 1.00000000, 0.00000000, 1, 1, 1, 13, 1, 6061, '2015-10-20 11:29:16', '2020-10-10 16:40:09', 104, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(185, 'PF-PFL-L43', 'PF-PFL-L43', '', '', '101', '', '', '', 35, 5, 'catalog/products/travel/flashlight/pf-pfl-l43-01.jpg', 80, 1, 1592.0000, 0, 12, '2015-10-21', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 1, 1778, '2015-10-22 08:31:29', '2021-08-26 18:52:39', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(186, '2279 Извещатель геркон на открытие окон и дверей (100м)', '2279', '', '', '101', '', '', '', 94, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/besprovodnye-datchiki/besprovodnoj-datchik-otkrytiya-dveri-ili-okna/besprovodnoj-datchik-otkrytiya-dveri-ili-okna-100m.jpg', 16, 1, 548.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 50, 1, 3079, '2015-10-22 20:50:14', '2020-10-19 21:57:59', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(187, '2160 Извещатель геркон на открытие металлической двери', '2160', '', '', '101', '', '', '', 99, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/besprovodnye-datchiki/besprovodnoj-datchik-otkrytiya-dveri-ili-okna/datcik_otkriitiay_mettallicheski_dveri.jpg', 0, 1, 910.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 50, 1, 2725, '2015-10-22 21:00:17', '2020-03-20 11:42:44', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(188, '3879 Пирон-4 Извещатель охранный оптико-электронный', '3879', '', '', '101', '', '', '', 88, 5, 'catalog/products/home/signalizacii/provodnye-gsm-signalizacii/provodnye-datchiki-dlya-gsm-signalizacij/piron-4-izveshhatel-okhrannyj-optiko-ehlektronnyj.jpeg', 16, 1, 529.0000, 0, 12, '2015-10-21', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 1, 4134, '2015-10-22 21:28:07', '2019-03-06 20:27:34', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(189, '1528 Извещатель охранный магнитоконтактный ИО-102-4 (СМК-4)', '1528', '', '', '101', '', '', '', 88, 5, 'catalog/products/home/signalizacii/provodnye-gsm-signalizacii/provodnye-datchiki-dlya-gsm-signalizacij/izveshhatel-okhrannyj-magnitokontaktnyj-smk-4.gif', 16, 1, 117.0000, 0, 12, '2015-10-21', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 21, 1, 4046, '2015-10-22 21:39:24', '2020-03-20 12:18:33', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(190, '2685 Извещатель охранный магнитоконтактный ИО-102-25 (СМК-25)', 'T4L-IO-102-25', '', '', '101', '100', '', '', 1, 5, 'catalog/products/home/signalizacii/provodnye-gsm-signalizacii/provodnye-datchiki-dlya-gsm-signalizacij/izveshhatel-okhrannyj-magnitokontaktnyj-smk-25.gif', 16, 1, 510.0000, 0, 12, '2015-10-21', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 21, 1, 3480, '2015-10-22 21:48:04', '2020-03-20 12:18:09', 202, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(191, 'Senseit GS2 комплект из 2-х розеток (Master + Slave)', '', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/gsm-rozetki/senseit-gs2-m/gs2_s_270x262_pc.jpg', 30, 1, 12940.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1005, 0, 2022, '2015-10-23 07:26:36', '2016-12-29 10:10:48', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(192, 'Отпугиватель Dazer II', 'Dazer II', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/dog/dazer-ii/Dazer_II_5.jpg', 24, 1, 4290.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 9001, 0, 5957, '2015-10-23 08:48:49', '2020-04-01 20:03:29', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(193, 'Слайд с проекцией &quot;Под водой&quot; STK', 'HOMESTAR-DISK-UNDER-WHATER', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/domashnij-planetarij/diski-proekcionnye/disk-proekcionnyj-homestar-pod-vodoj-stk/Disk-proyektsionnyy-Homestar-Pod-vodoy_1.jpg', 13, 1, 1790.0000, 0, 12, '2015-10-23', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 16, 1, 2364, '2015-10-24 19:26:50', '2021-06-03 23:02:49', 502, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(194, 'Слайд с проекцией &quot;Земля в космосе&quot;', 'HOMESTAR-DISK-EARTH', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/domashnij-planetarij/diski-proekcionnye/disk-proekcionnyj-homestar-zemlya-v-kosmose/disk_homestar_zemlja_v_kosmose_1.jpg', 13, 1, 1990.0000, 0, 12, '2015-10-23', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 1, 2361, '2015-10-24 19:33:10', '2021-05-06 17:42:51', 502, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(195, 'Слайд с проекцией &quot;Созвездия&quot;', 'HOMESTAR-DISK-CONSTELLATIONS', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/domashnij-planetarij/diski-proekcionnye/disk-proekcionnyj-homestar-sozvezdiya/sititek.ru_disk_homestar_sozvezdija_1.jpg', 13, 1, 1990.0000, 0, 12, '2015-10-23', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 1, 2501, '2015-10-24 19:37:02', '2021-05-06 17:46:02', 502, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(196, 'FB0024 Сетевой разветвитель с USB Power Cube Office', 'FB0024', '', '', '101', '', '', '', 0, 5, 'catalog/products/travel/power-cube-office/power_cube.jpg', 0, 1, 1750.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 485, '2015-10-24 21:21:30', '2016-06-14 13:13:01', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(197, 'MT6045 Водонепроницаемый плеер Плавушники', 'MT6045', '', '', '101', '', '', '', 0, 5, 'catalog/products/music/mp3-pleer-plavushniki/mp3-pleer-plavushniki-2.jpg', 19, 1, 4750.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1002, 0, 2527, '2015-10-24 22:15:17', '2018-12-15 15:26:05', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(198, 'MT6019 Вибродинамик PartyFon Max', 'MT6019', '', '', '101', '', '', '', 10, 5, 'catalog/products/music/mobilnyj-vibrodinamik-partyfon-max/mt6019_howitworks1.jpg', 19, 1, 2490.0000, 0, 12, '2015-09-18', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 98, 0, 1054, '2015-10-24 22:45:28', '2019-06-21 08:25:30', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(199, 'FB0022 Наушники с костной проводимостью SoundAround', 'FB0022', '', '', '101', '', '', '', 0, 5, 'catalog/products/music/besprovodnye-naushniki-soundaround/SoundAround-2.jpg', 19, 1, 7950.0000, 0, 12, '2015-09-18', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 91, 0, 657, '2015-10-25 13:54:39', '2018-07-28 19:42:05', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(200, 'MT1090 длинный зонд с видеокамерой Видеомастер PRO', 'MT1090', '', '', '101', '', '', '', 0, 5, 'catalog/products/car/gibkie-videokamery/main-1.png', 12, 1, 9900.0000, 0, 12, '2015-10-24', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 2015, '2015-10-25 15:52:03', '2018-07-28 19:52:05', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(202, 'MT1010 длинный зонд с видеокамерой Видеомастер ПК', 'MT1010', '', '', '101', '', '', '', 0, 5, 'catalog/products/car/gibkie-videokamery/gibkaya-videokamera-videomaster-pk/pb1442561530.jpg', 12, 1, 3900.0000, 0, 12, '2015-10-24', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 3, 0, 1734, '2015-10-25 16:50:45', '2018-07-28 19:52:18', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(203, 'MT1089 длинный зонд с видеокамерой Видеомастер', 'MT1089', '', '', '101', '', '', '', 0, 5, 'catalog/products/car/gibkie-videokamery/gibkaya-videokamera-videomaster-pro/KIT MT1089-1.jpg', 12, 1, 7500.0000, 0, 12, '2015-10-24', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 1512, '2015-10-25 17:06:37', '2018-07-28 19:51:54', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(204, '3181032000408 Городской рюкзак WENGER 32 л', '3181032000408', '', '', '101', '', '', '', 100, 5, 'catalog/products/daily/gorodskie-ryukzaki/ryukzak-wenger-32l/large_3181032000408.png', 25, 1, 5330.0000, 0, 12, '2015-10-24', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 1201, '2015-10-25 19:00:04', '2018-03-28 20:33:15', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(206, 'Рюкзак Wenger &quot;SLING BAG&quot; с одним плечевым ремнем', '18302130', '', '', '101', '', '', '', 100, 5, 'catalog/products/daily/gorodskie-ryukzaki/ryukzak-wenger-sling-bag/large_18302130.jpg', 25, 1, 1575.0000, 0, 12, '2015-10-24', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 1351, '2015-10-25 20:04:10', '2018-01-07 19:50:34', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(208, 'Усилитель GSM сигнала MOBI 900 COUNTRY', 'MOBI 900 COUNTRY', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/usiliteli-signala-gsm/usilitel-gsm-signala-mobi-900-country/mobi-900-country-2.png', 26, 1, 7990.0000, 0, 12, '2015-10-26', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 1142, '2015-10-27 15:46:36', '2018-03-31 14:44:24', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(209, 'Система наблюдения с видеокамерами Эконом Видео', '', '', '', '101', '', '', '', 0, 8, 'catalog/products/home/videonblyudenie/sapsan/komplekt-videonablyudeniya-sapsan-ehkonom-video/979.970.jpg', 16, 1, 9990.0000, 0, 12, '2015-10-17', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 2452, '2015-10-27 20:02:16', '2020-08-17 19:15:45', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(210, 'Sapsan GSM MMS 3G CAM &quot;Дом&quot;', 'Sapsan GSM MMS 3G CAM (к)', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/mms-video-signalizacii/gsm-signalizaciya-sapsan-gsm-mms-3g-cam-s-datchikami-2-mya-komnatnymi-kamerami/gsm-signalizaciya-sapsan-gsm-mms-3g-cam-s-datchikami-2-mya-komnatnymi-kamerami.jpg', 16, 1, 22288.0000, 0, 12, '2015-10-25', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 1, 3071, '2015-10-29 18:11:37', '2021-06-10 09:21:00', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(211, 'Сапсан GSM MMS 3G CAM &quot;Дача&quot;', 'Sapsan GSM MMS 3G CAM (у)', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/mms-video-signalizacii/gsm-signalizaciya-sapsan-gsm-mms-3g-cam-s-datchikami-2-mya-ulichnymi-kamerami/gsm-signalizaciya-sapsan-gsm-mms-3g-cam-s-datchikami-2-mya-ulichnymi-kamerami.jpg', 16, 1, 23509.0000, 0, 12, '2015-10-25', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 1, 4371, '2015-10-29 19:39:39', '2021-06-10 09:21:07', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(212, 'Маяк-12К Сирена для GSM сигнализации', 'Маяк-12К', '', '', '101', '', '', '', 93, 5, 'catalog/products/home/signalizacii/provodnye-gsm-signalizacii/provodnye-datchiki-dlya-gsm-signalizacij/opoveshhatel-sveto-zvukovoj-mayak-12.jpg', 16, 1, 441.0000, 0, 12, '2015-10-21', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 101, 1, 3940, '2015-11-05 17:32:54', '2019-12-13 18:36:42', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(213, '2407 Извещатель пожарный дымовой оптико-электронный ИПД-3.2 НЗ', '2407', '', '', '101', '', '', '', 97, 5, 'catalog/products/home/signalizacii/provodnye-gsm-signalizacii/provodnye-datchiki-dlya-gsm-signalizacij/izveshhatel-pozharnyj-dymovoj-optiko-ehlektronnyj-ipd-3-2.gif', 16, 1, 630.0000, 0, 12, '2015-10-21', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 98, 1, 4712, '2015-11-05 17:44:21', '2018-10-07 15:06:29', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(214, 'Проектор звездного неба  HomeStar Aurora Alaska', 'HOMESTAR-AURORA-ALASKA', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/domashnij-planetarij/planetarij-homestar-aurora-alaska/HomeStar-Aurora-Alaska-belyjj_1.jpg', 13, 1, 7490.0000, 0, 12, '2015-09-12', 1.00000000, 1, 30.00000000, 1.00000000, 30.00000000, 1, 1, 1, 5, 1, 4120, '2015-11-07 11:53:21', '2021-05-06 17:47:23', 502, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(215, 'АКБ-4,5', 'DBS-AKB-E-4-5', '', '', '101', '101', '', '', 100, 5, 'catalog/products/home/signalizacii/dopolnitelnoe-oborudovanie/akkumulyator-akb-7.gif', 0, 1, 1250.0000, 0, 12, '2015-10-13', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 100, 1, 2748, '2015-11-07 13:40:35', '2021-04-01 13:14:47', 103, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(216, 'МТ8061 Базовый блок и цифровая ручка', 'МТ8061', '', '', '101', '', '', '', 0, 5, 'catalog/products/education/cifrovaya-ruchka/cifrovaya-ruchka.png', 0, 1, 8900.0000, 0, 12, '2015-11-06', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 697, '2015-11-07 17:38:56', '2016-06-14 13:16:22', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(217, 'Кобура ThermaCell MR H12-00', 'MR H12-00', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/mosquito/termacell/add/chehol-s.jpeg', 35, 1, 585.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 3189, '2015-11-07 20:46:54', '2020-10-15 21:01:39', 105, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(218, 'Набор ThermaCell MR 400-12', 'THERMACELL-MR-400-12', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/mosquito/termacell/mr-400-12/mr-400-12-02.jpeg', 35, 1, 2580.0000, 0, 12, '2015-09-10', 300.00000000, 2, 10.00000000, 12.00000000, 7.00000000, 1, 1, 1, 3, 1, 5237, '2015-11-07 20:51:12', '2022-03-03 10:38:55', 105, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(219, 'Набор ThermaCell MR 000-12', 'THERMACELL-MR-000-12', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/mosquito/termacell/mr-000-12/mr-000-12-03.jpeg', 35, 1, 740.0000, 0, 12, '2015-09-10', 200.00000000, 2, 10.00000000, 13.00000000, 2.00000000, 1, 1, 1, 4, 1, 3880, '2015-11-07 20:56:15', '2021-05-18 20:20:13', 105, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(220, 'Кобура ThermaCell MR HT12-00', 'MR HT12-00', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/mosquito/termacell/add/comuflage-chehol-s.jpeg', 35, 1, 705.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 3024, '2015-11-07 21:00:41', '2020-06-11 09:55:17', 105, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(221, 'Отпугиватель комаров ThermaCell MR O06-00', '', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/mosquito/termacell/add/orange-s.jpeg', 35, 1, 1800.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 98, 0, 2261, '2015-11-07 21:04:05', '2019-01-26 18:25:10', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(222, 'Отпугиватель комаров ThermaCell MR L06-00', 'MR L06-00', '', '', '101', '', '', '', 0, 6, 'catalog/products/repeller/mosquito/termacell/add/lime-s.jpeg', 35, 1, 1800.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 98, 0, 2201, '2015-11-07 21:10:27', '2019-01-26 18:24:57', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(223, 'Противомоскитный прибор ThermaCell MR TJ06-00', 'MR TJ06-00', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/mosquito/termacell/add/otpugivatel-komarov-thermacell-kamuflyazhnyj.jpg', 35, 1, 2740.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 4670, '2015-11-07 21:12:19', '2020-04-30 12:21:25', 105, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(224, 'MT1091 Цифроскоп USB-микроскоп', 'MASTERKIT-MT1091', '', '', '101', '100', '', '', 0, 5, 'catalog/products/child/usb-microscope/MT1091/MT1091-1.jpg', 19, 1, 1190.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 4253, '2015-11-09 11:41:43', '2021-12-11 11:31:13', 501, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(225, 'MT9021 сигнализация для дачи, гаража, офиса, склада', 'MT9021', '', '', '101', '', '', '', 0, 5, 'data/home/gsm-signalizacia/avtonomnye-izveshhateli/dachnaya-sms-signalizaciya/mt9021-main.jpg', 12, 1, 4900.0000, 0, 12, '2015-10-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1, 0, 616, '2015-11-10 18:09:13', '2018-07-28 19:56:14', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(226, 'MT8056 Беспроводной сигнализатор угарного газа', 'MT8056', '', '', '101', '', '', '', 2, 5, 'catalog/products/home/signalizacii/avtonomnye-izveshhateli/detektor-ugarnogo-gaza/mt8056.jpg', 12, 1, 2950.0000, 0, 12, '2015-10-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1001, 0, 550, '2015-11-10 20:31:03', '2020-10-12 17:54:23', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(227, 'RU0059 Извещатель пожарный дымовой', 'RU0059', '', '', '101', '', '', '', 0, 5, 'data/home/gsm-signalizacia/avtonomnye-izveshhateli/izveshhatel-pozharnyj-dymovoj/ru0059-car02.jpg', 12, 1, 4950.0000, 0, 12, '2015-10-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 4, 0, 372, '2015-11-10 20:56:51', '2018-07-28 19:54:42', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(228, 'MT8055 Сигнализатор утечки газа', 'MASTERKIT-МТ8055', '', '', '101', '100', '', '', 0, 5, 'catalog/products/home/signalizacii/avtonomnye-izveshhateli/signalizaciya-utechki-gaza/001.jpg', 12, 1, 1890.0000, 0, 12, '2015-10-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1001, 0, 4702, '2015-11-10 21:26:29', '2021-10-26 07:39:57', 203, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(229, 'Цифровой микроскоп SITITEK Микрон-500', 'SITITEK Микрон-500', '', '', '101', '', '', '', 0, 5, 'catalog/products/child/usb-microscope/mikroskop-usb-sititek-mikron-500/mikron_500-500x500.png', 8, 1, 6790.0000, 0, 12, '2015-09-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 97, 0, 860, '2015-11-11 21:04:31', '2018-07-28 19:43:32', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(230, 'RU0089 GSM Сигнализатор Полюс GSM', 'RU0089', '', '', '101', '', '', '', 103, 5, 'data/home/gsm-signalizacia/avtonomnye-izveshhateli/okonno-dvernaya-gsm-signalizaciya/box-003-bg.jpg', 27, 1, 4290.0000, 0, 12, '2015-10-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 3, 0, 581, '2015-11-13 08:32:10', '2018-07-28 19:55:46', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(231, 'Глазок с видеокамерой &quot;СИТИТЕК Ай&quot;', 'SITITEK-EYE', '', '', '101', '100', '', '', 0, 5, 'catalog/products/home/videoglazok/sititek-eye/SITITEK-Eye_12.jpg', 8, 1, 8490.0000, 0, 12, '2009-02-03', 0.00000000, 2, 140.00000000, 0.00000000, 16.00000000, 2, 1, 1, 2, 1, 14037, '2015-11-14 09:13:25', '2021-08-11 19:41:33', 204, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(232, 'GF-4WB Уничтожитель насекомых, мошек, комаров', 'GF-4WB', '', '', '101', '100', '', '', 0, 5, 'catalog/products/repeller/mosquito/killer/gf-4wb/GF-4WB_3.jpg', 5, 1, 9030.0000, 0, 12, '2015-09-10', 5.00000000, 1, 215.00000000, 215.00000000, 32.00000000, 2, 1, 1, 2, 1, 3498, '2015-11-15 20:36:57', '2022-02-24 10:12:24', 109, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(233, 'MARS-004 Комнатный уничтожитель комаров', 'MARS-004', '', '', '101', '', '', '', 0, 5, 'catalog/products/repeller/mosquito/killer/mars-004/1869096.jpg', 5, 1, 2810.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1001, 0, 1897, '2015-11-15 20:55:49', '2020-08-17 12:35:29', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(234, 'Приманка для комаров, мошек', 'SITITEK-ATTRACTIVE-SITITEK', '', '', '101', '', '', '', 22, 5, 'catalog/products/repeller/mosquito/killer/attraktant-oktenol/sititek_1.jpg', 8, 1, 1200.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1003, 1, 3712, '2015-11-15 21:06:43', '2021-05-06 19:53:49', 109, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(235, 'Нонаналь приманка для комаров, мошек', 'SITITEK-ATTRACTIVE-NONANAL', '', '', '101', '', '', '', 11, 7, 'catalog/products/repeller/mosquito/killer/attraktant-nonanal/Nonanal_1.jpg', 9, 1, 1500.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 1003, 1, 3355, '2015-11-15 21:14:25', '2021-05-25 21:00:36', 109, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(236, 'Ангара-3 40Вт Уничтожитель комаров, мошек', 'Ангара-3 40Вт', '', '', '101', '', '', '', 0, 7, 'catalog/products/repeller/mosquito/killer/angara-2-40vt/Angara-2_40Vt_1.jpg', 8, 1, 6990.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 5, 0, 432, '2015-11-15 21:34:36', '2018-12-15 15:28:26', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(237, 'Ультразвуковой противомоскитный прибор Weitech WK0029', 'Weitech WK0029', '', '', '101', '', '', '', 2, 5, 'catalog/products/repeller/mosquito/uz/wk-0029/Weitech-WK0029_1.jpg', 10, 1, 2200.0000, 0, 12, '2015-09-10', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 50, 1, 2882, '2015-11-15 22:25:31', '2020-10-16 20:51:35', 105, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(238, '2739 Пульт RM-03', '2739', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/signalizacii/signalizatsiya-sapsan/pult-okhrany/RM-01/rm-01.jpg', 0, 1, 750.0000, 0, 12, '2015-10-12', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 1, 2371, '2015-11-16 08:14:28', '2020-08-19 21:48:17', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(239, 'Тапочки с массажем и фонариком RST-3011', 'RST-3011', '', '', '101', '', '', '', 0, 5, 'catalog/products/happy_new_year/RST-3011/rst3011.jpg', 0, 1, 2600.0000, 0, 12, '2015-11-15', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 2366, '2015-11-16 17:50:49', '2019-11-03 21:21:38', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(240, 'Светильник Тетрис LF-922', 'LF-922', '', '', '101', '', '', '', 0, 5, 'catalog/products/happy_new_year/LF-922/lf-922-s.jpg', 0, 1, 1360.0000, 0, 12, '2015-11-15', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 3, 0, 1567, '2015-11-16 18:12:15', '2021-11-12 16:15:17', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(241, 'Робот-пылесос Ecovacs DeeBot D76', '', '', '', '101', '', '', '', 1000, 5, 'catalog/products/home/robot/deebot-d76/0000125_large.jpg', 0, 1, 25990.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 3, 0, 1952, '2015-11-16 20:06:07', '2019-12-28 15:15:28', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(242, 'Робот-пылесос Ecovacs DeeBot D56', '', '', '', '101', '', '', '', 1000, 5, 'catalog/products/home/robot/deebot-d56/d56.jpg', 0, 1, 10790.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 99, 0, 1743, '2015-11-16 20:31:08', '2019-12-28 15:17:17', 0, 0, NULL);
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(243, 'Глазок с видеокамерой SITITEK PentaLux Light', 'PentaLux Light', '', '', '101', '', '', '', 0, 5, 'catalog/products/home/videoglazok/sititek-pentalux-light/pentalux-light_1.jpg', 8, 1, 5200.0000, 0, 12, '2015-09-11', 0.00000000, 2, 0.00000000, 0.00000000, 0.00000000, 2, 1, 1, 2, 0, 607, '2015-11-17 07:24:21', '2018-07-28 19:50:13', 0, 0, NULL);

INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(453, 'Прибор от птиц САПСАН-3', 'ЮСТ-САПСАН-3', '', '', '101', '100', '', '', 3, 5, 'catalog/products/repeller/bird/bioakustika/sapsan-3/sapsan-3-1.jpg', 141, 1, 5450.0000, 0, 12, '2015-09-10', 1.00000000, 1, 14.00000000, 14.00000000, 11.00000000, 1, 1, 1, 1, 1, 8769, '2016-07-15 15:58:59', '2023-02-04 12:31:36', 103, 0, '');
INSERT INTO oc_product (product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name) VALUES(489, 'Шипы от птиц из металла &quot;Игла С-1&quot;', 'LADIA-IGLA-S-1', '', '', '101', '', '', '', 326, 8, 'catalog/products/repeller/bird/antiprisadnye/metallicheskie-antiprisadnye-shipy-ladia/spikes-metal-01.jpg', 70, 1, 340.0000, 0, 12, '2015-10-19', 120.00000000, 2, 0.00000000, 120.00000000, 0.00000000, 2, 1, 10, 197, 1, 4224, '2016-11-12 18:34:17', '2021-05-06 20:03:17', 103, 0, NULL);


INSERT INTO sr_person (id, first_name, last_name, country_iso_code_2, phone_number, email, middle_name) VALUES(7822, 'Ирина', 'Шишкина', 'RU', '(926) 336-52-44', 'vanka-254@mail.ru', '');
INSERT INTO sr_person (id, first_name, last_name, country_iso_code_2, phone_number, email, middle_name) VALUES(7821, 'Алексей', 'Атаманчук', 'RU', '(911) 366-50-13', 'am.baltfish@yandex.ru', 'Михайлович');

INSERT INTO sr_customer (id, type, person_id, status, date_added) VALUES(7811, 1, 7822, 1, '2023-03-17 15:32:58');
INSERT INTO sr_customer (id, type, person_id, status, date_added) VALUES(7810, 2, NULL, 1, '2023-03-17 13:48:43');

INSERT INTO sr_customer_company (id, customer_id, country_iso_code_2, inn, short_name, long_name) VALUES(1464, 7810, 'RU', '', 'ООО "БАЛТ-ФИШ ПРО"', '');

INSERT INTO sr_address (id, type, country_iso_code_2, city, pvz, post_code, address, subway_station, annotation, city_id, street, house, flat, pvz_id) VALUES(16455, 1, 'RU', NULL, NULL, '', 'Москва, ул. Габричевского, 10', NULL, NULL, 0, NULL, NULL, NULL, 'null');
INSERT INTO sr_address (id, type, country_iso_code_2, city, pvz, post_code, address, subway_station, annotation, city_id, street, house, flat, pvz_id) VALUES(16457, 1, 'RU', NULL, NULL, '000000', 'Москва ул. Габричевского, 10 корп. 1', NULL, NULL, 0, NULL, NULL, NULL, 'null');

INSERT INTO sr_address (id, type, country_iso_code_2, city, pvz, post_code, address, subway_station, annotation, city_id, street, house, flat, pvz_id) VALUES(16446, 1, 'RU', 'Псков', 'PSK3', '', 'Псков, ул. Красноармейская, 6', NULL, NULL, 393, '', '', '', '0');
INSERT INTO sr_address (id, type, country_iso_code_2, city, pvz, post_code, address, subway_station, annotation, city_id, street, house, flat, pvz_id) VALUES(16456, 1, 'RU', 'Москва', 'MSK539', '', 'Москва, ул. Габричевского, 10 корп. 1', NULL, NULL, 44, '', '', '', 'null');
INSERT INTO sr_address (id, type, country_iso_code_2, city, pvz, post_code, address, subway_station, annotation, city_id, street, house, flat, pvz_id) VALUES(16458, 1, 'RU', 'Москва', 'MSK539', '', 'Москва, ул. Габричевского, 10 корп. 1', NULL, NULL, 44, '', '', '', '0');

INSERT INTO sr_customer_address (id, address_id, customer_id) VALUES(4967, 16455, 7811);
INSERT INTO sr_customer_address (id, address_id, customer_id) VALUES(4968, 16457, 7811);

INSERT INTO sr_customer_contact (id, type, customer_id, person_id) VALUES(1380, 1, 7810, 7821);

INSERT INTO sr_order (id, order_no, order_year, order_date, source_type, advert_type, payment_type, category_product_id, customer_id, amount_total, amount_bill, amount_supplier, amount_margin, amount_postpay, annotation, status, date_added, user_added, date_modified, order_type, amount_total_with_delivery, order_sub_no, status_email, offer_count_day, offer_date_start, store_id) VALUES(10714, 14293, 23, '2023-03-17 00:00:00', 4, 1, 2, 103, 7811, 1700.0000, 1700.0000, 1325.0000, 383.3500, 1776.0000, '', 2, '2023-03-17 15:40:25', 1, '2023-03-17 18:44:33', 1, 1976.0000, 0, 0, 0, '2023-03-17 00:00:00', 2);
INSERT INTO sr_order (id, order_no, order_year, order_date, source_type, advert_type, payment_type, category_product_id, customer_id, amount_total, amount_bill, amount_supplier, amount_margin, amount_postpay, annotation, status, date_added, user_added, date_modified, order_type, amount_total_with_delivery, order_sub_no, status_email, offer_count_day, offer_date_start, store_id) VALUES(10713, 14292, 23, '2023-03-17 00:00:00', 2, 1, 2, 103, 7811, 1700.0000, 1700.0000, 1325.0000, 318.7500, 1700.0000, '', 13, '2023-03-17 15:32:58', 1, '2023-03-17 15:41:46', 1, 2020.0000, 0, 0, 0, '2023-03-17 00:00:00', 2);
INSERT INTO sr_order (id, order_no, order_year, order_date, source_type, advert_type, payment_type, category_product_id, customer_id, amount_total, amount_bill, amount_supplier, amount_margin, amount_postpay, annotation, status, date_added, user_added, date_modified, order_type, amount_total_with_delivery, order_sub_no, status_email, offer_count_day, offer_date_start, store_id) VALUES(10708, 14291, 23, '2023-03-17 00:00:00', 2, 2, 1, 103, 7810, 5450.0000, 5450.0000, 3890.0000, 1291.1500, 0.0000, '', 1, '2023-03-17 13:48:43', 1, '2023-03-17 14:26:24', 2, 5660.0000, 0, 0, 0, '2023-03-17 00:00:00', 2);

INSERT INTO sr_order_delivery (id, order_id, delivery_type, address_id, date_delivery, time_in, time_out, price, annotation, track_code, payment_delivery_type, recipient_id, seller_price, customer_price) VALUES(10667, 10708, 101, 16446, NULL, NULL, NULL, 210.0000, '', '', 1, null, 251.0000, 210.0000);
INSERT INTO sr_order_delivery (id, order_id, delivery_type, address_id, date_delivery, time_in, time_out, price, annotation, track_code, payment_delivery_type, recipient_id, seller_price, customer_price) VALUES(10672, 10713, 101, 16456, NULL, NULL, NULL, 320.0000, '', '', 1, null, 320.0000, 320.0000);
INSERT INTO sr_order_delivery (id, order_id, delivery_type, address_id, date_delivery, time_in, time_out, price, annotation, track_code, payment_delivery_type, recipient_id, seller_price, customer_price) VALUES(10673, 10714, 101, 16458, NULL, NULL, NULL, 276.0000, '', '1413342631', 1, null, 200.0000, 276.0000);


INSERT INTO sr_order_item (id, no, order_id, product_id, price, quantity, discount_rate, amount, amount_supplier) VALUES(27835, 1, 10708, 453, 5450.0000, 1, 0.0000, 5450.0000, 3890.0000);
INSERT INTO sr_order_item (id, no, order_id, product_id, price, quantity, discount_rate, amount, amount_supplier) VALUES(27844, 1, 10713, 489, 340.0000, 5, 0.0000, 1700.0000, 265.0000);
INSERT INTO sr_order_item (id, no, order_id, product_id, price, quantity, discount_rate, amount, amount_supplier) VALUES(27855, 1, 10714, 489, 340.0000, 5, 0.0000, 1700.0000, 265.0000);

INSERT INTO sr_order_status (id, order_id, status, date_added, user_added, crm_status, crm_sub_status) VALUES(39095, 10713, 1, '2023-03-17 15:33:01', 1, '', '');
INSERT INTO sr_order_status (id, order_id, status, date_added, user_added, crm_status, crm_sub_status) VALUES(39090, 10708, 1, '2023-03-17 13:48:46', 1, '', '');
INSERT INTO sr_order_status (id, order_id, status, date_added, user_added, crm_status, crm_sub_status) VALUES(39097, 10714, 1, '2023-03-17 15:40:27', 1, '', '');
INSERT INTO sr_order_status (id, order_id, status, date_added, user_added, crm_status, crm_sub_status) VALUES(39098, 10713, 13, '2023-03-17 15:41:46', 1, NULL, NULL);
INSERT INTO sr_order_status (id, order_id, status, date_added, user_added, crm_status, crm_sub_status) VALUES(39099, 10714, 2, '2023-03-17 15:48:38', 1, NULL, NULL);
INSERT INTO sr_order_status (id, order_id, status, date_added, user_added, crm_status, crm_sub_status) VALUES(39110, 10714, 5, '2023-03-20 14:56:50', 1, NULL, NULL);




/*
insert into oc_setting
(store_id,code,key,value,serialized)
values
(0, 'yandex_beru', 'yandex_beru_auth_token', '7C00000130783B1E', 0);
insert into oc_setting
(store_id,code,key,value,serialized)
values
(0, 'yandex_beru', 'yandex_beru_2_auth_token', '81000001227D383D', 0);
insert into oc_setting
(store_id,code,key,value,serialized)
values
(0, 'yandex_beru', 'yandex_beru_3_auth_token', '550000019F7E2527', 0);
insert into oc_setting
(store_id,code,key,value,serialized)
values
(0, 'yandex_beru', 'yandex_beru_dbs_auth_token', 'BD0000018B82AA8F', 0);
*/

INSERT INTO sr_sys_config
(code, value, annotation)
VALUES
('company_j_name', 'ИП Федоров Алексей Анатольевич', 'наименование организации'),
('company_j_inn', '771872248140', 'ИНН организации'),
('company_j_address', '107241, г.Москва, Щелковское Шоссе д.29', 'адрес организации'),
('company_shop_address', '107241, г.Москва, Щелковское Шоссе д.29', 'точка самовывоза'),
('company_shop_name_short', 'СЭР РИЧАРД РУ', 'наименование интернет-магазина'),
('company_shop_name_long', 'ИНТЕРНЕТ-КОМПАНИЯ СЭР РИЧАРД РУ', 'наименование интернет-магазина'),
('order_no_current', '4285', 'текущий номер заказа'),
('alarm_car_host', '192.168.1.68', 'ip адрес хоста автомобильной сигнализации'),
('ozon_enabled', 'false', 'озон включен (да/нет)');

INSERT INTO sr_sys_total_amount
(id, annotation)
VALUES
(101, 'рекламный бюджет за период'),
(102, 'число сеансов за период'),
(107, 'число уникальных посетителей за период'),
(111, 'число новых посетителей за период'),
(103, 'доход за период'),
(104, 'прибыль за период'),
(105, 'наложка за период'),
(106, 'число реальных заказов за период'),
(108, 'наложенный платеж СДЭК'),
(109, 'наложенный платеж Почта России'),
(110, 'постоплата организаций'),
(127, 'конверсия в заказ'),
(128, 'конверсия в заявку');


INSERT INTO sr_wiki_order_source (id, annotation) VALUES(1, 'звонок');
INSERT INTO sr_wiki_order_source (id, annotation) VALUES(2, 'чат');
INSERT INTO sr_wiki_order_source (id, annotation) VALUES(3, 'письмо');
INSERT INTO sr_wiki_order_source (id, annotation) VALUES(4, 'лид');
INSERT INTO sr_wiki_order_source (id, annotation) VALUES(5, 'быстрый заказ');
INSERT INTO sr_wiki_order_source (id, annotation) VALUES(6, 'обратный звонок');
INSERT INTO sr_wiki_order_source (id, annotation) VALUES(7, 'повторное обращение');

INSERT INTO sr_wiki_crm
(id, annotation)
VALUES
(1, 'Админка сайта Opencart'),
(2, 'Быстрй заказ'),
(3, 'СДЭК');

INSERT INTO sr_wiki_crm_status
(id, annotation)
VALUES
(0, 'Нет обработки'),
(1, 'Успешно'),
(2, 'Ошибка');

INSERT INTO sr_wiki_customer_type
(id, annotation)
VALUES
(1, 'физическое лицо'),
(2, 'юридическое лицо'),
(3, 'индивидуальный предприниматель'),
(4, 'нерезидент, физическое лицо'),
(5, 'нерезидент, юридическое лицо'),
(6, 'неопределен');

INSERT INTO sr_wiki_customer_status
(id, annotation)
VALUES
(1, 'действует'),
(2, 'удален'),
(3, 'черный список');

INSERT INTO sr_wiki_address_type
(id, annotation)
VALUES
(1, 'главный'),
(2, 'дополнительный'),
(3, 'пункт выдачи'),
(4, 'терминал'),
(5, 'самовывоз');

INSERT INTO sr_wiki_contact_type
(id, annotation)
VALUES
(1, 'главный'),
(2, 'дополнительный');

INSERT INTO sr_wiki_order_source
(id, annotation)
VALUES
(1, 'звонок'),
(2, 'чат'),
(3, 'письмо'),
(4, 'лид'),
(5, 'быстрый заказ'),
(6, 'обратный звонок'),
(8, 'тендер');

INSERT INTO sr_wiki_order_advert
(id, annotation)
VALUES
(1, 'реклама'),
(2, 'поиск'),
(3, 'youtube'),
(4, 'сарафанное радио'),
(5, 'повторное обращение'),
(6, 'холодный звонок'),
(8, 'тендер');

INSERT INTO sr_wiki_order_payment
(id, annotation)
VALUES
(1, 'предоплата'),
(2, 'постоплата'),
(5, 'наличными курьеру'),
(6, 'банковской картой'),
(7, 'Apple Pay'),
(8, 'Google Pay'),
(9, 'в кредит');

INSERT INTO sr_wiki_order_payment_delivery
(id, annotation)
VALUES
(1, 'оплачивает доставку покупатель'),
(2, 'оплачивает доставку продавец');

INSERT INTO sr_wiki_order_type
(id, annotation)
VALUES
(1, 'заказ'),
(2, 'счет на оплату'),
(3, 'коммерческое предложение'),
(4, 'консультация'),
(11, 'замена'),
(12, 'возврат'),
(13, 'подарок'),
(14, 'тест-драйв'),
(15, 'ремонт');

INSERT INTO sr_wiki_order_status
(id, annotation)
VALUES
(1, 'заявка'),
(2, 'подтвержден'),
(3, 'ожидаем оплату'),
(4, 'оплата получена'),
(5, 'доставляется'),
-- (6, 'на доставке у курьера'),
(7, 'прибыл'),
(8, 'завершен'),
(9, 'отказ от вручения, возврат'),
(10, 'получен'),
(11, 'отсутствуют документы'),
(12, 'заканчивается срок хранения'),
(13, 'отменен'),
(15, 'возврат получен'),
(16, 'утерян'),
(21, 'удален');

INSERT INTO sr_wiki_comment_type
(id, annotation)
VALUES
(1, 'коментарий'),
(2, 'конвертер');

INSERT INTO sr_wiki_order_delivery
(id, category, annotation)
VALUES
(101, 'СДЭК', 'СДЭК, ПВЗ'),
(102, 'СДЭК', 'СДЭК, ЭКОНОМ ПВЗ'),
(103, 'СДЭК', 'CDEK, курьер'),
(104, 'СДЭК', 'СДЭК, ЭКОНОМ курьер'),
(201, 'Деловые Линии', 'Деловые Линии'),
(301, 'МОСКВА курьер 1-2 дня', 'курьер, 1-2 дня'),
(302, 'МОСКВА курьер, сегодня', 'курьер, сегодня'),
(303, 'МО курьер, 1-2 дня', 'МО, курьер'),
(401, 'ПОЧТА РОССИИ', 'ПОЧТА, обычное'),
(402, 'ПОЧТА РОССИИ', 'ПОЧТА, 1-й класс'),
(405, 'ПОЧТА EMS', 'ПОЧТА, EMS'),
(403, 'самовывоз, сегодня', 'самовывоз'),
(501, 'YANDEX MARKET', 'до склада Яндекс-Маркет'),
(701, 'OZON', 'до склада OZON'),
(601, 'YANDEX GO', 'Яндекс-Логистика'),
(801, 'OZON Rocket', 'OZON Rocket ПВЗ'),
(802, 'OZON Rocket', 'OZON Rocket постамат'),
(803, 'OZON Rocket', 'OZON Rocket курьер');

INSERT INTO sr_wiki_order_delivery_price
(id, delivery_id, annotation, price)
VALUES
(1, 301, NULL, 300),
(2, 302, NULL, 500),
(3, 303, 'до 15 км от МКАД', 500),
(4, 303, 'от 16 до 35 км от МКАД', 800),
(5, 303, 'от 36 до 60 км от МКАД', 1300),
(6, 303, 'от 61 км до 100 км от МКАД', 1900),
(7, 403, NULL, 0);


-- DELETE FROM sr_wiki_category_product;

INSERT INTO sr_wiki_category_product
(id, type_group, annotation)
VALUES
(0, 'прочие', 'не определена'),

(101, 'отпугиватели', 'отпугиватели кротов'),
(102, 'отпугиватели', 'отпугиватели змей'),
(103, 'отпугиватели', 'отпугиватели птиц'),
(104, 'отпугиватели', 'отпугиватели грызунов'),
(105, 'отпугиватели', 'отпугиватели комаров'),
(107, 'отпугиватели', 'отпугиватели ос'),
(108, 'отпугиватели', 'отпугиватели собак'),
(109, 'отпугиватели', 'уничтожители насекомых'),
(110, 'отпугиватели', 'отпугиватели клещей'),

(201, 'для дома', 'gsm розетки и реле'),
(202, 'для дома', 'gsm сигнализации'),
(203, 'для дома', 'автономные извещатели'),
(204, 'для дома', 'видеоглазки и видеодомофоны'),
(205, 'для дома', 'видеонаблюдение'),
(206, 'для дома', 'ножеточки'),
(207, 'для дома', 'эконаборы'),
(208, 'для дома', 'светильники'),
(209, 'для дома', 'столики для ноутбука'),
(210, 'для дома', 'роботы для уборки'),
(211, 'для дома', 'средства защиты'),

(301, 'для автомобиля', 'алкотестеры'),
(302, 'для автомобиля', 'пуско-зарядные устройства'),
(303, 'для автомобиля', 'гибкие камеры'),
(304, 'для автомобиля', 'гаджеты'),

(401, 'для дачи', 'изотермика'),
(403, 'для дачи', 'мобильный душ'),
(404, 'для дачи', 'системы полива'),
(405, 'для дачи', 'термосы'),

(501, 'для детей', 'микроскопы USB'),
(502, 'для детей', 'домашние планетарии'),
(503, 'для детей', 'видеоняни'),
(504, 'для детей', 'конструкторы'),

(601, 'безопасность', 'антижучки'),
(602, 'безопасность', 'обнаружители видеокамер'),
(603, 'безопасность', 'подавители диктофонов'),
(604, 'безопасность', 'подавители сотовых телефонов'),

(701, 'путешествия', 'стельки с подогревом'),
(702, 'путешествия', 'возвращатели'),
(703, 'путешествия', 'мини электростанции'),

(801, 'музыка', 'наушники'),
(802, 'музыка', 'колонки'),

(901, 'для домашних животных', 'фурминатор для кошек'),
(902, 'для домашних животных', 'фурминатор для собак'),
(903, 'для домашних животных', 'автокормушки и автопоилки'),
(904, 'для домашних животных', 'электронные ошейники'),

(1111, 'производство', 'инкубаторы'),

(1101, 'прочие', 'элементы питания'),
(1102, 'прочие', 'инструменты'),
(1103, 'прочие', 'подарки'),
(1104, 'прочие', 'для рыбалки'),
(1105, 'прочие', 'для охоты'),
(1106, 'прочие', 'фонари');

INSERT INTO sr_wiki_stock
(id, annotation)
VALUES
(1, 'основной'),
(2, 'СИТИТЕК, Москва');

INSERT INTO sr_wiki_supplier
(id, annotation)
VALUES
(1, 'СИТИТЕК'),
(2, 'ЭКОСНАЙПЕР'),
(3, 'ДАДЖЕТ'),
(4, 'КЕМПИНГ 2000'),
(5, 'ТЕХНОЛОГИИ ДЛЯ ЖИЗНИ'),
(6, 'ЛАДЬЯ'),
(7, 'ЭЛАНГ'),
(8, 'ТЕЛЕМЕТРИКА'),
(9, 'ЮСТ'),
(10, 'МИГОВАТТ'),
(11, 'СЛЕДОПЫТ'),
(12, 'ПИРОХАУС'),
(14, 'HOONT'),
(15, 'CARKU'),
(16, 'ТОРНАДО'),
(21, 'СЛЕДОПЫТ ЯМ-РЫБАЛКА');

INSERT INTO sr_stock
(id, product_id, stock_id, supplier_id, supplier_price, quantity, supplier_quantity)
VALUES
(1, 45, 1, 5, 4500, 0, 0);

/*
INSERT INTO sr_wiki_stock_supplier
(id, stock_id, supplier_id)
VALUES
(101, 1, 1),
(102, 1, 1),
(103, 1, 1),
(104, 1, 1),
(105, 1, 1),
(106, 1, 1),
(107, 1, 1),
(108, 1, 1),
(109, 1, 1),
(110, 1, 1),
(111, 2, 1);
*/

/*
INSERT INTO sr_product_key
(product_id, product_key)
SELECT product_id, name FROM sr_v_product;
*/

INSERT INTO sr_address
(id, type, country_iso_code_2, address)
VALUES
(0, 5, 'RU', '');

 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 834;
 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 620;
 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 840;
 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 841;

 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 629;
 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 761;
 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 762;

 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 821;
 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 1029;
 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 1028;
 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 1030;

 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 699;
 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 456;

 UPDATE OC_PRODUCT SET COMPOSITE = 1 WHERE PRODUCT_ID = 1288;

 DELETE FROM SR_PRODUCT_COMPOSITE;

 INSERT INTO SR_PRODUCT_COMPOSITE
 (ID, MASTER_PRODUCT_ID, SLAVE_PRODUCT_ID, SLAVE_QUANTITY, SLAVE_TYPE)
 VALUES
 (1, 821, 835, 1, 1),
 (2, 821, 843, 1, 1),

 (3, 834, 835, 1, 1),
 (4, 834, 842, 1, 1),

 (5, 620, 839, 1, 1),
 (6, 620, 621, 10, 1),

 (7, 840, 839, 1, 1),
 (8, 840, 621, 2, 1),

 (9, 841, 839, 1, 1),
 (10, 841, 621, 4, 1),

 (11, 629, 632, 1, 1),
 (12, 629, 614, 1, 1),

 (13, 761, 632, 1, 1),
 (14, 761, 614, 2, 1),

 (15, 762, 632, 1, 1),
 (16, 762, 614, 4, 1),

 (17, 1029, 985, 1, 1),
 (18, 1029, 986, 1, 1),

 (19, 1028, 985, 1, 1),
 (20, 1028, 986, 2, 1),

 (21, 1030, 985, 1, 1),
 (22, 1030, 986, 4, 1),

 (23, 699, 700, 1, 1),
 (24, 699, 769, 1, 1),

 (25, 456, 700, 1, 1),
 (26, 456, 769, 1, 1),
 (27, 456, 770, 1, 1),

 (31, 1288, 687, 2, 1),
 (32, 1288, 1287, 2, 1);


SET SQL_SAFE_UPDATES = 0;

insert into oc_setting
(`store_id`,`code`,`key`,`value`,`serialized`)
values
(0, 'yandex_beru', 'yandex_beru_auth_token', '7C00000130783B1E', 0);
insert into oc_setting
(`store_id`,`code`,`key`,`value`,`serialized`)
values
(0, 'yandex_beru', 'yandex_beru_2_auth_token', '81000001227D383D', 0);
insert into oc_setting
(`store_id`,`code`,`key`,`value`,`serialized`)
values
(0, 'yandex_beru', 'yandex_beru_3_auth_token', '550000019F7E2527', 0);
insert into oc_setting
(`store_id`,`code`,`key`,`value`,`serialized`)
values
(0, 'yandex_beru', 'yandex_beru_dbs_auth_token', 'BD0000018B82AA8F', 0);

INSERT INTO sr_sys_config
(code, value, annotation)
VALUES
("company_j_name", "ИП Федоров Алексей Анатольевич", "наименование организации"),
("company_j_inn", "771872248140", "ИНН организации"),
("company_j_address", "107241, г.Москва, Щелковское Шоссе д.29", "адрес организации"),
("company_shop_address", "107241, г.Москва, Щелковское Шоссе д.29", "точка самовывоза"),
("company_shop_name_short", "СЭР РИЧАРД РУ", "наименование интернет-магазина"),
("company_shop_name_long", "ИНТЕРНЕТ-КОМПАНИЯ СЭР РИЧАРД РУ", "наименование интернет-магазина"),
("order_no_current", "4285", "текущий номер заказа"),
("alarm_car_host", "192.168.1.68", "ip адрес хоста автомобильной сигнализации"),
("ozon_enabled", "false", "озон включен (да/нет)");

INSERT INTO sr_sys_total_amount
(id, annotation)
VALUES
(101, "рекламный бюджет за период"),
(102, "число сеансов за период"),
(107, "число уникальных посетителей за период"),
(111, "число новых посетителей за период"),
(103, "доход за период"),
(104, "прибыль за период"),
(105, "наложка за период"),
(106, "число реальных заказов за период"),
(108, "наложенный платеж СДЭК"),
(109, "наложенный платеж Почта России"),
(110, "постоплата организаций"),
(127, "конверсия в заказ"),
(128, "конверсия в заявку");

INSERT INTO sr_wiki_crm
(id, annotation)
VALUES
(1, "Админка сайта Opencart"),
(2, "Быстрй заказ"),
(3, "СДЭК");

INSERT INTO sr_wiki_crm_status
(id, annotation)
VALUES
(0, "Нет обработки"),
(1, "Успешно"),
(2, "Ошибка");

INSERT INTO sr_wiki_customer_type
(id, annotation)
VALUES
(1, "физическое лицо"),
(2, "юридическое лицо"),
(3, "индивидуальный предприниматель"),
(4, "нерезидент, физическое лицо"),
(5, "нерезидент, юридическое лицо"),
(6, "неопределен");

INSERT INTO sr_wiki_customer_status
(id, annotation)
VALUES
(1, "действует"),
(2, "удален"),
(3, "черный список");

INSERT INTO sr_wiki_address_type
(id, annotation)
VALUES
(1, "главный"),
(2, "дополнительный"),
(3, "пункт выдачи"),
(4, "терминал"),
(5, "самовывоз");

INSERT INTO sr_wiki_contact_type
(id, annotation)
VALUES
(1, "главный"),
(2, "дополнительный");

INSERT INTO sr_wiki_order_source
(id, annotation)
VALUES
(1, "звонок"),
(2, "чат"),
(3, "письмо"),
(4, "лид"),
(5, "быстрый заказ"),
(6, "обратный звонок"),
(8, "тендер");

INSERT INTO sr_wiki_order_advert
(id, annotation)
VALUES
(1, "реклама"),
(2, "поиск"),
(3, "youtube"),
(4, "сарафанное радио"),
(5, "повторное обращение"),
(6, "холодный звонок"),
(8, "тендер");

INSERT INTO sr_wiki_order_payment
(id, annotation)
VALUES
(1, "предоплата"),
(2, "постоплата"),
(5, "наличными курьеру"),
(6, "банковской картой"),
(7, "Apple Pay"),
(8, "Google Pay"),
(9, "в кредит");

INSERT INTO sr_wiki_order_payment_delivery
(id, annotation)
VALUES
(1, "оплачивает доставку покупатель"),
(2, "оплачивает доставку продавец");

INSERT INTO sr_wiki_order_type
(id, annotation)
VALUES
(1, "заказ"),
(2, "счет на оплату"),
(3, "коммерческое предложение"),
(4, "консультация"),
(11, "замена"),
(12, "возврат"),
(13, "подарок"),
(14, "тест-драйв"),
(15, "ремонт");

INSERT INTO sr_wiki_order_status
(id, annotation)
VALUES
(1, "заявка"),
(2, "подтвержден"),
(3, "ожидаем оплату"),
(4, "оплата получена"),
(5, "доставляется"),
-- (6, "на доставке у курьера"),
(7, "прибыл"),
(8, "завершен"),
(9, "отказ от вручения, возврат"),
(10, "получен"),
(11, "отсутствуют документы"),
(12, "заканчивается срок хранения"),
(13, "отменен"),
(15, "возврат получен"),
(16, "утерян"),
(21, "удален");

INSERT INTO sr_wiki_comment_type
(id, annotation)
VALUES
(1, "коментарий"),
(2, "конвертер");

INSERT INTO sr_wiki_order_delivery
(id, category, annotation)
VALUES
(101, "СДЭК", "СДЭК, ПВЗ"),
(102, "СДЭК", "СДЭК, ЭКОНОМ ПВЗ"),
(103, "СДЭК", "CDEK, курьер"),
(104, "СДЭК", "СДЭК, ЭКОНОМ курьер"),
(201, "Деловые Линии", "Деловые Линии"),
(301, "МОСКВА курьер 1-2 дня", "курьер, 1-2 дня"),
(302, "МОСКВА курьер, сегодня", "курьер, сегодня"),
(303, "МО курьер, 1-2 дня", "МО, курьер"),
(401, "ПОЧТА РОССИИ", "ПОЧТА, обычное"),
(402, "ПОЧТА РОССИИ", "ПОЧТА, 1-й класс"),
(405, "ПОЧТА EMS", "ПОЧТА, EMS"),
(403, "самовывоз, сегодня", "самовывоз"),
(501, "YANDEX MARKET", "до склада Яндекс-Маркет"),
(701, "OZON", "до склада OZON"),	
(601, "YANDEX GO", "Яндекс-Логистика"),
(801, "OZON Rocket", "OZON Rocket ПВЗ"),
(802, "OZON Rocket", "OZON Rocket постамат"),
(803, "OZON Rocket", "OZON Rocket курьер");

INSERT INTO sr_wiki_order_delivery_price
(id, delivery_id, annotation, price)
VALUES
(1, 301, NULL, 300),
(2, 302, NULL, 500),
(3, 303, "до 15 км от МКАД", 500),
(4, 303, "от 16 до 35 км от МКАД", 800),
(5, 303, "от 36 до 60 км от МКАД", 1300),
(6, 303, "от 61 км до 100 км от МКАД", 1900),
(7, 403, NULL, 0);

SET SQL_SAFE_UPDATES = 0;
DELETE FROM sr_wiki_category_product;

INSERT INTO sr_wiki_category_product
(id, type_group, annotation)
VALUES
(0, "прочие", "не определена"),

(101, "отпугиватели", "отпугиватели кротов"),
(102, "отпугиватели", "отпугиватели змей"),
(103, "отпугиватели", "отпугиватели птиц"),
(104, "отпугиватели", "отпугиватели грызунов"),
(105, "отпугиватели", "отпугиватели комаров"),
(107, "отпугиватели", "отпугиватели ос"),
(108, "отпугиватели", "отпугиватели собак"),
(109, "отпугиватели", "уничтожители насекомых"),
(110, "отпугиватели", "отпугиватели клещей"),

(201, "для дома", "gsm розетки и реле"),
(202, "для дома", "gsm сигнализации"),
(203, "для дома", "автономные извещатели"),
(204, "для дома", "видеоглазки и видеодомофоны"),
(205, "для дома", "видеонаблюдение"),
(206, "для дома", "ножеточки"),
(207, "для дома", "эконаборы"),
(208, "для дома", "светильники"),
(209, "для дома", "столики для ноутбука"),
(210, "для дома", "роботы для уборки"),
(211, "для дома", "средства защиты"),

(301, "для автомобиля", "алкотестеры"),
(302, "для автомобиля", "пуско-зарядные устройства"),
(303, "для автомобиля", "гибкие камеры"),
(304, "для автомобиля", "гаджеты"),

(401, "для дачи", "изотермика"),
(403, "для дачи", "мобильный душ"),
(404, "для дачи", "системы полива"),
(405, "для дачи", "термосы"),

(501, "для детей", "микроскопы USB"),
(502, "для детей", "домашние планетарии"),
(503, "для детей", "видеоняни"),
(504, "для детей", "конструкторы"),

(601, "безопасность", "антижучки"),
(602, "безопасность", "обнаружители видеокамер"),
(603, "безопасность", "подавители диктофонов"),
(604, "безопасность", "подавители сотовых телефонов"),

(701, "путешествия", "стельки с подогревом"),
(702, "путешествия", "возвращатели"),
(703, "путешествия", "мини электростанции"),

(801, "музыка", "наушники"),
(802, "музыка", "колонки"),

(901, "для домашних животных", "фурминатор для кошек"),
(902, "для домашних животных", "фурминатор для собак"),
(903, "для домашних животных", "автокормушки и автопоилки"),
(904, "для домашних животных", "электронные ошейники"),

(1111, "производство", "инкубаторы"),

(1101, "прочие", "элементы питания"),
(1102, "прочие", "инструменты"),
(1103, "прочие", "подарки"),
(1104, "прочие", "для рыбалки"),
(1105, "прочие", "для охоты"),
(1106, "прочие", "фонари");

INSERT INTO sr_wiki_stock
(id, annotation)
VALUES
(1, "основной"),
(2, "СИТИТЕК, Москва");

INSERT INTO sr_wiki_supplier
(id, annotation)
VALUES
(1, "СИТИТЕК"),
(2, "ЭКОСНАЙПЕР"),
(3, "ДАДЖЕТ"),
(4, "КЕМПИНГ 2000"),
(5, "ТЕХНОЛОГИИ ДЛЯ ЖИЗНИ"),
(6, "ЛАДЬЯ"),
(7, "ЭЛАНГ"),
(8, "ТЕЛЕМЕТРИКА"),
(9, "ЮСТ"),
(10, "МИГОВАТТ"),
(11, "СЛЕДОПЫТ"),
(12, "ПИРОХАУС"),
(14, "HOONT"),
(15, "CARKU"),
(16, "ТОРНАДО"),
(21, "СЛЕДОПЫТ ЯМ-РЫБАЛКА");

INSERT INTO sr_stock
(product_id, stock_id, supplier_id, supplier_price, quantity)
VALUES
(45, 1, 5, 4500, 0);

/*
INSERT INTO sr_wiki_stock_supplier
(id, stock_id, supplier_id)
VALUES
(101, 1, 1),
(102, 1, 1),
(103, 1, 1),
(104, 1, 1),
(105, 1, 1),
(106, 1, 1),
(107, 1, 1),
(108, 1, 1),
(109, 1, 1),
(110, 1, 1),
(111, 2, 1);
*/

/*
INSERT INTO sr_product_key
(product_id, product_key)
SELECT product_id, name FROM sr_v_product;
*/

INSERT INTO sr_address
(id, type, country_iso_code_2, address)
VALUES
(0, 5, 'RU', '');

SET SQL_SAFE_UPDATES = 0;

INSERT INTO sr_wiki_alarm_event_type
(id, annotation)
VALUES
(1, "gps location"),
(2, "ping"),
(3, "проникновение"),
(4, "temperature & humidity"),
(5, "постановка"),
(6, "снятие");


