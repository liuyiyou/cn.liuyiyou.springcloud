docker build -t discovery:latest .
docker-compose down -t 15
docker-compose -f docker-compose-single.yml
docker-compose up -d