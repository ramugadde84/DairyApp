INSERT INTO USER_DATA (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, lastpasswordrestdate)
VALUES (1, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 
'admin', 'admin@admin.com', 1, sysdate());
INSERT INTO USER_DATA (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, lastpasswordrestdate)
VALUES (2, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 
'user', 'enabled@user.com', 1,
sysdate());
INSERT INTO USER_DATA (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, lastpasswordrestdate)
VALUES (3, 'disabled', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 
'user', 'user', 'disabled@user.com', 0,
sysdate());

INSERT INTO AUTHORITY (authority_id, NAME) VALUES (1, 'ROLE_USER');
INSERT INTO AUTHORITY (authority_id, NAME) VALUES (2, 'ROLE_ADMIN');

INSERT INTO USER_AUTHORITY  VALUES (1, 1);
INSERT INTO USER_AUTHORITY  VALUES (1, 2);
INSERT INTO USER_AUTHORITY  VALUES (2, 1);
INSERT INTO USER_AUTHORITY  VALUES (3, 1);


commit;