FROM mysql

ENV MYSQL_RANDOM_ROOT_PASSWORD=true
ENV MYSQL_USER=dev
ENV MYSQL_PASSWORD=x_eRT2vv4
ENV MYSQL_DATABASE=school

COPY dbscript.sql studentbase.sql /docker-entrypoint-initdb.d

