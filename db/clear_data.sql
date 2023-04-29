SET SQL_SAFE_UPDATES = 0;

-- customer
DELETE FROM sr_customer_address WHERE id > 0;
DELETE FROM sr_customer_company WHERE id > 0;
DELETE FROM sr_customer WHERE id > 0;
DELETE FROM sr_address WHERE id > 0;
DELETE FROM sr_person WHERE id > 0;
-- order
DELETE FROM sr_order_utm WHERE id > 0;
DELETE FROM sr_order_status WHERE id > 0;
DELETE FROM sr_order_delivery WHERE id > 0;
DELETE FROM sr_order_item WHERE id > 0;
DELETE FROM sr_order_comment WHERE id > 0;
DELETE FROM sr_order WHERE id > 0;






