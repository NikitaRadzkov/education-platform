FROM node

WORKDIR /usr/src/app

COPY package*.json ./

RUN apk add --no-cache git

RUN npm install

COPY . .

CMD [ "npm", "run", "remark" ]
