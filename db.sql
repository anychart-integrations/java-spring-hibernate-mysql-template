create user 'anychart_user'@'localhost' identified by 'anychart_pass';
create database anychart_db;
grant all privileges on anychart_db.* to 'anychart_user'@'localhost';

CREATE TABLE fruits (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(64),
  value INT
);

INSERT INTO fruits (name, value) VALUES
  ('apples', 10),
  ('oranges', 20),
  ('bananas', 15),
  ('lemons', 5),
  ('pears', 3),
  ('apricots', 7),
  ('kiwis', 9),
  ('mangos', 12),
  ('figs', 4),
  ('limes', 8);