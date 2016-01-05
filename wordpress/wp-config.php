<?php
/** 
 * As configurações básicas do WordPress.
 *
 * Esse arquivo contém as seguintes configurações: configurações de MySQL, Prefixo de Tabelas,
 * Chaves secretas, Idioma do WordPress, e ABSPATH. Você pode encontrar mais informações
 * visitando {@link http://codex.wordpress.org/Editing_wp-config.php Editing
 * wp-config.php} Codex page. Você pode obter as configurações de MySQL de seu servidor de hospedagem.
 *
 * Esse arquivo é usado pelo script ed criação wp-config.php durante a
 * instalação. Você não precisa usar o site, você pode apenas salvar esse arquivo
 * como "wp-config.php" e preencher os valores.
 *
 * @package WordPress
 */

// ** Configurações do MySQL - Você pode pegar essas informações com o serviço de hospedagem ** //
/** O nome do banco de dados do WordPress */
define('DB_NAME', 'wordpress');

/** Usuário do banco de dados MySQL */
define('DB_USER', 'root');

/** Senha do banco de dados MySQL */
define('DB_PASSWORD', '');

/** nome do host do MySQL */
define('DB_HOST', 'localhost');

/** Conjunto de caracteres do banco de dados a ser usado na criação das tabelas. */
define('DB_CHARSET', 'utf8mb4');

/** O tipo de collate do banco de dados. Não altere isso se tiver dúvidas. */
define('DB_COLLATE', '');

/**#@+
 * Chaves únicas de autenticação e salts.
 *
 * Altere cada chave para um frase única!
 * Você pode gerá-las usando o {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * Você pode alterá-las a qualquer momento para desvalidar quaisquer cookies existentes. Isto irá forçar todos os usuários a fazerem login novamente.
 *
 * @since 2.6.0
 */
define('AUTH_KEY',         'nT-Ct|g-3}r:FmZMJ~e1ZlM3%caZ~)TL@O4->DOVy=h<W CN7k?P]3%;(mcm*4fW');
define('SECURE_AUTH_KEY',  'QwMd03[fbN%v||#Nos+BVYw`aRNwF5~#W7X$U-N`p@m$(YHBU~=/-x3<:0Zk%P-l');
define('LOGGED_IN_KEY',    '@9DZrK`A*g6`JVwNz]-ukQ/L,611%AFr9 ]^>23tfk0(SPi[cc}+w)%a$+L+6$Y=');
define('NONCE_KEY',        ']H4i:JYIG]Cb1Expz8GYaX6XG$nN_`+}v]D.rK@=om0`gI?v#viL}R3WlpJyy$4y');
define('AUTH_SALT',        'Dr%; &@I7DGe=n>A+D=)-a{m:/+ Z*i+jzyC9vY1,pC1fA=)>=[)896f4T8ITM[w');
define('SECURE_AUTH_SALT', 'd.|*dLg|3OG|#-.WHm{9+QuD!4d.bCT1~oMVq0uM9f1|,JZ~/q03v;;{7s=npDm6');
define('LOGGED_IN_SALT',   'LZ[c8?K*UV]-4Wa9}yw>c=cE2d-!q4>OJx&-<9*Ttqyyjf-!WpVu2)lb|?o}P)O0');
define('NONCE_SALT',       ']fA`~)<zH. QSq`zBR@@8)Ur=)tOcI>:@Lh7m7 9nL)8@rMuH?:@yej=B=ZvR%:z');

/**#@-*/

/**
 * Prefixo da tabela do banco de dados do WordPress.
 *
 * Você pode ter várias instalações em um único banco de dados se você der para cada um um único
 * prefixo. Somente números, letras e sublinhados!
 */
$table_prefix  = 'wp_';


/**
 * Para desenvolvedores: Modo debugging WordPress.
 *
 * altere isto para true para ativar a exibição de avisos durante o desenvolvimento.
 * é altamente recomendável que os desenvolvedores de plugins e temas usem o WP_DEBUG
 * em seus ambientes de desenvolvimento.
 */
define('WP_DEBUG', false);

/* Isto é tudo, pode parar de editar! :) */

/** Caminho absoluto para o diretório WordPress. */
if ( !defined('ABSPATH') )
	define('ABSPATH', dirname(__FILE__) . '/');
	
/** Configura as variáveis do WordPress e arquivos inclusos. */
require_once(ABSPATH . 'wp-settings.php');
