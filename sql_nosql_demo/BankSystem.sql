--DROP TYPE if EXISTS customer_type;
--DROP TYPE if EXISTS account_type;

CREATE TYPE customer_type AS ENUM ('PERSONAL','BUSINESS','JOINT');
CREATE TYPE account_type AS ENUM ('CHECKING','SAVINGS','MARGIN');
CREATE TYPE transaction_type AS ENUM ('WITHDRAW','DEPOSIT');


DROP TABLE IF EXISTS Transactions CASCADE;
DROP TABLE IF EXISTS Account CASCADE;
DROP TABLE IF EXISTS Customer;


CREATE TABLE Customer
(
    customer_id   INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    email		  VARCHAr(40) unique			   NOT NULL,
    first_name    VARCHAR(20)                      NOT NULL,
    last_name     VARCHAR(20)                      NOT NULL,
    customer_type customer_type                    NOT NULL,
    address       VARCHAR(20)                      NOT NULL,
    PRIMARY KEY (customer_id)
);


CREATE TABLE Account
(
    account_id   INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    email 	VARCHAR(40) NOT NULL,
--     11 digit # w/ 2 decimal places so $1 000 000 000,00
    balance      NUMERIC(11, 2) NOT NULL,
    account_type account_type Not NULL,
    PRIMARY KEY(account_id),
    FOREIGN KEY (email) REFERENCES Customer(email)
);


CREATE TABLE Transactions
(
    transaction_id INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    account_id     INT NOT NULL,
    amount         NUMERIC(10, 2)                   NOT NULL,
    transaction_type transaction_type not NULL,
    date           timestamp DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(transaction_id),
    FOREIGN KEY (account_id) REFERENCES Account (account_id)
);


insert into customer(first_name,last_name,email,customer_type,address) VALUES ('alex','cohen','alex.cohen@weareadaptive.com','PERSONAL','2000 westbank');
insert into customer(first_name,last_name,email,customer_type,address) VALUES ('mark','antony','mark.antony@rome.italy','PERSONAL','2340 ancient egypt');
insert into customer(first_name,last_name,email,customer_type,address) VALUES ('augustus','caesar','augustus.caesar@rome.italy','BUSINESS','240 parthenon');
insert into customer(first_name,last_name,email,customer_type,address) VALUES ('flavius','vespasian','f.vespasian@rome.italy','BUSINESS','453 palace');


--SELECT * from customer;

insert into account(email,balance,account_type) VALUES ('mark.antony@rome.italy',100000,'CHECKING');
insert into account(email,balance,account_type) VALUES ('augustus.caesar@rome.italy',4000000,'SAVINGS');
insert into account(email,balance,account_type) VALUES ('f.vespasian@rome.italy',5000000,'CHECKING');
insert into account(email,balance,account_type) VALUES ('alex.cohen@weareadaptive.com',5,'MARGIN');


--SELECT * FROM account;
--first_name,last_name,customer_type,address) VALUES ('andrew','ryan','PERSONAL','4500 Rapture');


--join the account and customer tables
select customer.*,account.balance,account.account_type from customer INNER join account on customer.email=account.email;


insert into transactions(account_id,amount,transaction_type) VALUES (2,300,'WITHDRAW');
insert into transactions(account_id,amount,transaction_type) VALUES (2,20000,'DEPOSIT');
insert into transactions(account_id,amount,transaction_type) VALUES (4,300,'DEPOSIT');
insert into transactions(account_id,amount,transaction_type) VALUES (3,300,'WITHDRAW');
insert into transactions(account_id,amount,transaction_type) VALUES (1,4000,'DEPOSIT');
insert into transactions(account_id,amount,transaction_type) VALUES (1,400,'WITHDRAW');

--select * from transactions;

--select customer.*,account.balance,account.account_type, transactions.amount, transactions.transaction_type, transactions.date
--from customer INNER join account on customer.email=account.email INNER join transactions on transactions.account_id=account.account_id;