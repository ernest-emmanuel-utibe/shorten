package com.shortenServer.services;

import com.shortenServer.dtos.requests.CheckAvailabilityRequestDTO;
import com.shortenServer.dtos.requests.CreateLinkRequestDTO;
import com.shortenServer.dtos.requests.UpdateSlugRequestDTO;
import com.shortenServer.dtos.responses.CheckSlugAvailabilityResponseDTO;
import com.shortenServer.dtos.responses.LinkDTO;
import com.shortenServer.dtos.responses.Paginated;

public interface LinkService {

    LinkDTO createLink(CreateLinkRequestDTO createLinkRequestDTO);

    LinkDTO updateSlug(UpdateSlugRequestDTO updateSlugRequestDTO);

    CheckSlugAvailabilityResponseDTO checkAvailability(CheckAvailabilityRequestDTO checkAvailabilityRequestDTO);

    void deleteLink(Long id);

    Paginated<LinkDTO> getAllLinks();

    LinkDTO getLink(Long id);

}