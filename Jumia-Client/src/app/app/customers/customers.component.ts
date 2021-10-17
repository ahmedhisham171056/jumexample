import { Component, OnInit } from '@angular/core';

import { Customer } from '../model/customer';
import { CustomerService } from "../service/customer.service";

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['../app.component.css']
})
export class CustomersComponent implements OnInit {

  customers: Customer[] = [];
  page!: number;
  title = 'Jumia Phone Status app!';

  filterTerm!: string;
  
  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    this.getCustomers();

  }

  private getCustomers() {
    this.customerService.findAll().subscribe(data => {
      this.customers = data;
    });
  }

}
