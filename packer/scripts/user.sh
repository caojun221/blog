#!/bin/bash

# setup www user
sudo groupadd www
sudo useradd -g www www
sudo mkdir /home/www/
sudo usermod -d /home/www www
