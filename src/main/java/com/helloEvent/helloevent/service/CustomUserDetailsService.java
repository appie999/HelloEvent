package com.helloEvent.helloevent.service;

//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//
//        if(user == null){
//            throw new UsernameNotFoundException("User not found ");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
//    }
//}
