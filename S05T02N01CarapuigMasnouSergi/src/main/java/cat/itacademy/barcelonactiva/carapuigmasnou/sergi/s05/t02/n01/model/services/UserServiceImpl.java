package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.repository.UserResponseDto;
import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.repository.UserRepository;
import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.services.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserResponseDto getUser(String uuid){
        return userRepository.getUser(uuid);
    }

}
