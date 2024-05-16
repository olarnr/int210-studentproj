FROM node:lts-alpine AS build
WORKDIR code
COPY . .
RUN npm install
RUN npm run build

FROM nginx:alpine AS run
COPY --from=build /code/dist/ /dist/
COPY default.conf /etc/nginx/conf.d/default.conf

LABEL org.opencontainers.image.source = "https://github.com/olarnr/int210-studentproj"