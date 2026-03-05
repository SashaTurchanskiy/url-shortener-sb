package com.url.url_shortener.service;

import com.url.url_shortener.dtos.UrlMappingDTO;
import com.url.url_shortener.models.User;

import java.util.List;

public interface UrlMappingService {

    UrlMappingDTO createShortUrl(String originalUrl, User user);

    List<UrlMappingDTO> getUrlsByUser(User user);
}
