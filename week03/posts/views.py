from django.shortcuts import render, redirect
from django.http import HttpResponse, JsonResponse
from django.views import View
from django.views.generic import ListView
from .models import Post
from .forms import PostBasedForm, PostModelForm

# Create your views here.

def post_form_view(request):
    if request.method=='GET':
        form = PostBasedForm()
        context = {'form': form }
        return render(request, 'post_form.html', context)
    else:
        form = PostBasedForm(request.POST, request.FILES)
        if form.is_valid():
            Post.objects.create(
                image = form.cleaned_data['image'],
                content = form.cleaned_data['content']
            )
        else:
            print(form.errors)
            return render(request, 'post_form.html', {'form': form})
        return redirect('posts:post-list')

def post_list_view(request):
    posts = Post.objects.all()
    context = {'posts': posts}
    return render(request, 'post_list.html', context)

def post_model_form_view(request):
    if request.method=='GET':
        form = PostModelForm()
        context = {'form': form }
        return render(request, 'post_model_form.html', context)
    else:
        form = PostModelForm(request.POST, request.FILES)
        if form.is_valid():
            form.save()
        else:
            print(form.errors)
            return render(request, 'post_model_form.html', {'form': form})
    return redirect('posts:post-list')