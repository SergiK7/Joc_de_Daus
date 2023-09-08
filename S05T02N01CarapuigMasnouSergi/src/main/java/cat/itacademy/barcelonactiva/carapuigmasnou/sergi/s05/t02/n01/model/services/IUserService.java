package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.services;

import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.repository.UserResponseDto;

public interface IUserService {

    UserResponseDto getUser(String uuid);
}