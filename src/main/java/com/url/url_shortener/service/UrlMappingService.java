package com.url.url_shortener.service;

import com.url.url_shortener.dtos.UrlMappingDTO;
import com.url.url_shortener.models.User;

public interface UrlMappingService {

    UrlMappingDTO createShortUrl(String originalUrl, User user);
}
