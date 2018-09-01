import { ApolloModule, Apollo } from 'apollo-angular';
import { HttpLinkModule, HttpLink } from 'apollo-angular-link-http';
import { Injectable } from '@angular/core';
import { InMemoryCache } from 'apollo-cache-inmemory';

@Injectable({
  providedIn: 'root'
})
export class GraphqlService {

  constructor(apollo: Apollo, httpLink: HttpLink) {
    apollo.create({
      // By default, this client will send queries to the
      // `/graphql` endpoint on the same host
      link: httpLink.create({uri: 'https://api.example.com/graphql'}),
      cache: new InMemoryCache(),
    });
  }
}
