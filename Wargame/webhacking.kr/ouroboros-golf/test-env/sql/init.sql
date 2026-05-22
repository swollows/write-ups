CREATE TABLE IF NOT EXISTS prob_ouroboros (
  pw VARCHAR(255) NOT NULL
);
INSERT INTO prob_ouroboros (pw) VALUES ('a-real-password-we-cannot-know');
GRANT ALL ON ouroboros.* TO 'ouro'@'%';
FLUSH PRIVILEGES;
