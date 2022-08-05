import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LamboComponent } from './page-2/lambo/lambo.component';
import { AccountDetailComponent } from './pages/account-detail/account-detail.component';
import { AccountStatementComponent } from './pages/account-statement/account-statement.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { LoginComponent } from './pages/login/login.component';
import { PensionStatementComponent } from './pages/pension-statement/pension-statement.component';
import { PersonalDetailComponent } from './pages/personal-detail/personal-detail.component';
import { RegisterComponent } from './pages/register/register.component';
import { ResetPasswordComponent } from './pages/reset-password/reset-password.component';

const routes: Routes = [
  { path: '', component: LoginComponent},
  { path: 'login', component: LoginComponent},
  { path: 'registration', component: RegisterComponent},
  { path: 'reset-password', component: ResetPasswordComponent},
  { path: 'home', component: DashboardComponent},
  { path: 'personal-detail', component: PersonalDetailComponent},
  { path: 'account-detail', component: AccountDetailComponent},
  { path: 'pension-statement', component: PensionStatementComponent},
  { path: 'account-statement', component: AccountStatementComponent},
  { path: 'lambo', component: LamboComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true, scrollPositionRestoration: 'top'})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
