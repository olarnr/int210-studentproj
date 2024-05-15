FROM mysql/mysql-server

ENV MYSQL_RANDOM_ROOT_PASSWORD=true
ENV MYSQL_USER=dev
ENV MYSQL_PASSWORD=x_eRT2vv4
ENV MYSQL_DATABASE=school

COPY scripts/ /docker-entrypoint-initdb.d/

HEALTHCHECK --interval=2s --timeout=2s --retries=20 CMD /healthcheck.sh
