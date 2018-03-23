package com.kuzmin.train.training.business;

import com.kuzmin.train.training.AppConfig;
import com.kuzmin.train.training.JpaRepositoriesConfig;
import com.kuzmin.train.training.business.model.Address;
import com.kuzmin.train.training.business.model.Human;
import com.kuzmin.train.training.business.model.Job;
import com.kuzmin.train.training.configuration.PersistenceContextConfig;
import com.kuzmin.train.training.repository.AddressRepository;
import com.kuzmin.train.training.repository.HumanRepository;
import com.kuzmin.train.training.repository.JobRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Main {

    private JobRepository jobRepository;
    private HumanRepository humanRepository;
    private AddressRepository addressRepository;

//    @Autowired
//    public Main(JobRepository jobRepository, HumanRepository humanRepository, AddressRepository addressRepository) {
//        this.jobRepository = jobRepository;
//        this.humanRepository = humanRepository;
//        this.addressRepository = addressRepository;
//    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new
                AnnotationConfigApplicationContext(
                AppConfig.class,
                PersistenceContextConfig.class,
                JpaRepositoriesConfig.class);

        Main object = ctx.getBean(Main.class);

        System.out.println("Storing job object");
        Job job = new Job(333, "programmer", "IT");
        object.jobRepository.save(job);

        System.out.println("Storing human object");
        Address address = new Address(444, "Moscow", "Kolotushkina", 94);
        object.addressRepository.save(address);

        System.out.println("Storing human object");
        Human human = new Human(22, "Alan", "Walker", 23, address, job);
        object.humanRepository.save(human);

        Human alan = object.humanRepository.getHumanByName("Alan");
        System.out.println(alan);

    }

}
