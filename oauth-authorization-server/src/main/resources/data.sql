INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('raviClient', '$2a$10$tD8Vjgs.tqMCSzI4kkyIvesFoxqOGSVr9sIyhtgGmGo0XXEKE/icm', 'manager,read,write',
	'password,authorization_code,refresh_token,client_credentials', null, null, 36000, 36000, null, true);
INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('riteshClient', '$2a$10$tD8Vjgs.tqMCSzI4kkyIvesFoxqOGSVr9sIyhtgGmGo0XXEKE/icm', 'read,write,employee',
	'implicit', null, null, 36000, 36000, null, false);
INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('sunilClient', '$2a$10$tD8Vjgs.tqMCSzI4kkyIvesFoxqOGSVr9sIyhtgGmGo0XXEKE/icm', 'manager,employee,read,write',
	'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);
